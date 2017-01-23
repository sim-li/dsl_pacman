package ai;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import ai.generated.*;

public class AiBaseListenerImplementation extends AiBaseListener {

    @Override public void enterField(AiParser.FieldContext ctx) { }

        @Override public void exitField(AiParser.FieldContext ctx) { }

        @Override public void enterRow(AiParser.RowContext ctx) {
            System.out.println("Hello");
        }

        @Override public void exitRow(AiParser.RowContext ctx) { }

        @Override public void enterValue(AiParser.ValueContext ctx) {
            System.out.println("Hello");
        }

        @Override public void exitValue(AiParser.ValueContext ctx) {
            System.out.println("Hello");
        }

        @Override public void enterEveryRule(ParserRuleContext ctx) { }

        @Override public void exitEveryRule(ParserRuleContext ctx) { }

        @Override public void visitTerminal(TerminalNode node) { }

        @Override public void visitErrorNode(ErrorNode node) { }
}
