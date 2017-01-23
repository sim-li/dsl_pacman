package ai;

import ai.nodes.Node;
import ai.nodes.Root;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import ai.generated.*;

public class AiBaseListenerImplementation extends AiBaseListener {
    private Node rootNode;

    @Override public void enterAi(AiParser.AiContext ctx) {}

    @Override public void exitAi(AiParser.AiContext ctx) { }

    @Override public void enterStartai(AiParser.StartaiContext ctx) {
        rootNode = new Root(ctx.start.getText());
    }

    @Override public void exitStartai(AiParser.StartaiContext ctx) { }

    @Override public void enterAi_body(AiParser.Ai_bodyContext ctx) { }

    @Override public void exitAi_body(AiParser.Ai_bodyContext ctx) { }

    @Override public void enterReference(AiParser.ReferenceContext ctx) { }

    @Override public void exitReference(AiParser.ReferenceContext ctx) { }

    @Override public void enterBlock_declaration(AiParser.Block_declarationContext ctx) { }

    @Override public void exitBlock_declaration(AiParser.Block_declarationContext ctx) { }

    @Override public void enterAssignment(AiParser.AssignmentContext ctx) { }

    @Override public void exitAssignment(AiParser.AssignmentContext ctx) { }

    @Override public void enterIf_free_statement(AiParser.If_free_statementContext ctx) { }

    @Override public void exitIf_free_statement(AiParser.If_free_statementContext ctx) { }

    @Override public void enterRandom_statement(AiParser.Random_statementContext ctx) { }

    @Override public void exitRandom_statement(AiParser.Random_statementContext ctx) { }

    @Override public void enterRatio_expr(AiParser.Ratio_exprContext ctx) { }

    @Override public void exitRatio_expr(AiParser.Ratio_exprContext ctx) { }

    @Override public void enterLeave_free_statement(AiParser.Leave_free_statementContext ctx) { }

    @Override public void exitLeave_free_statement(AiParser.Leave_free_statementContext ctx) { }

    @Override public void enterGet_nth_free_statement(AiParser.Get_nth_free_statementContext ctx) { }

    @Override public void exitGet_nth_free_statement(AiParser.Get_nth_free_statementContext ctx) { }

    @Override public void enterEnd_ai(AiParser.End_aiContext ctx) { }

    @Override public void exitEnd_ai(AiParser.End_aiContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }

    public Node getRootNode() {
        return this.rootNode;
    }

    private void d() {
        // Does nothing;
    }
}

