package level;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import level.generated.*;

public class LevelBaseListenerImplementation extends LevelBaseListener {

    @Override public void enterField(LevelParser.FieldContext ctx) { }

        @Override public void exitField(LevelParser.FieldContext ctx) { }

        @Override public void enterRow(LevelParser.RowContext ctx) {
            System.out.println("Hello");
            ;
        }

        @Override public void exitRow(LevelParser.RowContext ctx) { }

        @Override public void enterValue(LevelParser.ValueContext ctx) {
            System.out.println("Hello");
            ;

        }

        @Override public void exitValue(LevelParser.ValueContext ctx) {
            System.out.println("Hello");
            ;
        }

        @Override public void enterEveryRule(ParserRuleContext ctx) { }

        @Override public void exitEveryRule(ParserRuleContext ctx) { }

        @Override public void visitTerminal(TerminalNode node) { }

        @Override public void visitErrorNode(ErrorNode node) { }
}
