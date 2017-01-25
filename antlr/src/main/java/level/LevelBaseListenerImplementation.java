package level;

import level.generated.LevelBaseListener;
import level.generated.LevelParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

public class LevelBaseListenerImplementation extends LevelBaseListener {

    boolean check = true;

    private List values;

    private List<List> totalvalues = new ArrayList<List>();

    public List<List> getTotalValues() {
        if(check == true) {
            System.out.println("Ok");
            //System.out.println(totalvalues);
            return totalvalues;
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
       if(totalvalues.size() != 20){
           System.out.println("Row Error - Exactly 20 rows allowed");
           check = false;
       }
       else {
           getTotalValues();
       }
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
        if (values.size() != 20 ) {
            System.out.println("Value Error in Line " + totalvalues.size() + " - Exactly 20 values per row allowed");
            check = false;
        }
        //System.out.println(values.size());
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
