package level;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import level.generated.*;

import java.util.ArrayList;
import java.util.List;

public class LevelBaseListenerImplementation extends LevelBaseListener {

    private List values;

    private List<List> totalvalues = new ArrayList<>();

    public List<List> getTotalValues() {
        System.out.println(totalvalues.size());
        System.out.println(values.size());
        if(totalvalues.size() == 20 && values.size() == 20) {
            System.out.println("ok");
            System.out.println(totalvalues);
            return totalvalues;

        }
        else{
            System.out.println("value / row error");
        }
        return null;
    }


    @Override
    public void enterField(LevelParser.FieldContext ctx) {
        //System.out.println("enterField()");
        ctx.getText().replace(";", ",");
    }

    @Override
    public void exitField(LevelParser.FieldContext ctx) {
        //System.out.println("exitField()");
       getTotalValues();
    }

    @Override
    public void enterRow(LevelParser.RowContext ctx) {
        //System.out.println("enterRow()");
        values = new ArrayList();
    }

    @Override
    public void exitRow(LevelParser.RowContext ctx) {
        //System.out.println("exitRow()");
        totalvalues.add(values);
    }

    @Override
    public void enterValue(LevelParser.ValueContext ctx) {
        //System.out.println("enterValue()");
        values.add(ctx.Value());
    }

    @Override
    public void exitValue(LevelParser.ValueContext ctx) {
        //System.out.println("exitValue()");

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
