package ai;

import ai.nodes.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import ai.generated.*;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import sun.tools.tree.IfStatement;

import java.util.ArrayList;
import java.util.List;

public class AiBaseListenerImplementation extends AiBaseListener {
    private Node currentNode;
    private int bracketsOpen = 0;

    @Override public void enterStartai(AiParser.StartaiContext ctx) {
        currentNode = new Root(ctx.start.getText());
    }

    @Override public void enterBracket_open(AiParser.Bracket_openContext ctx) {
        bracketsOpen++;
    }

    @Override public void enterBracket_close(AiParser.Bracket_closeContext ctx) {
        bracketsOpen--;
        browseToParentIfAvailable();
    }

    private void browseToParentIfAvailable() {
        final Node parent = this.currentNode.getParent();
        if (!(parent instanceof EmptyNode)) {
            this.currentNode = this.currentNode.getParent();
        }
    }

    @Override public void enterReference(AiParser.ReferenceContext ctx) {
        //*
    }

    @Override public void enterAssignment(AiParser.AssignmentContext ctx) {
        //*
    }


    @Override public void enterIf_free_statement(AiParser.If_free_statementContext ctx) {
        final Node ifFree = new IfFree(ctx.getChild(1).getText());
        final Node ifContainer = new IfContainer();
        ifContainer.addChild(ifFree);
        add(ifContainer);
    }

    @Override public void enterElse_free_statement(AiParser.Else_free_statementContext ctx) {
        final Node elseStatement = new Else();
        add(elseStatement);
    }

    @Override public void enterRatio_expr(AiParser.Ratio_exprContext ctx) {
        final List<String> ratiosAsString = new ArrayList<String>();
        for (final ParseTree n: ctx.children) {
            final String textRepr = n.getText().replace(":", "");
            if (!textRepr.equals("(") && !textRepr.equals(")")) {
                ratiosAsString.add(textRepr);
            }
        }
        final Node random = new Random(ratiosAsString);
        add(random);
    }

    @Override public void enterDirection_statement(AiParser.Direction_statementContext ctx) {
        final Node direction = new Direction(ctx.getChild(0).getText());
        add(direction);
    }

    @Override public void enterLeave_free_statement(AiParser.Leave_free_statementContext ctx) {
        final Node filterFree = new FilterFree();
        add(filterFree);
    }

    @Override public void enterGet_nth_free_statement(AiParser.Get_nth_free_statementContext ctx) {
        final String number = ctx.children.get(0).getText().split("\\*")[1];
        final Node filterFreeN = new FilterFreeN(number);
        add(filterFreeN);
    }

    @Override public void enterEnd_ai(AiParser.End_aiContext ctx) {
        if(bracketsOpen > 0) {
            System.out.println("You failed to close brackets in your grammar");
        }
    }

    private void add(Node n) {
        if ((n instanceof Else) && !(currentNode instanceof IfContainer)) {
            System.out.println("Tried to add else without preceding if block");
        }
        if (!(n instanceof Else) && !(n instanceof IfFree) && currentNode instanceof IfContainer) {
            System.out.println("Illegal state, possible programming error: Opened an IfContainer and trying to add other than if or else block.");
        }
        this.currentNode.addChild(n);
        this.currentNode = n;
    }

    public Node getCurrentNode() {
        Node rootNode = this.currentNode;
//        while(!(rootNode instanceof EmptyNode)) {
//            rootNode = rootNode.getParent();
//        }
        return rootNode;
    }

    private void d() {
        // For debugging, does nothing.
    }
}

