package field;

import models.Line;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.List;

public class GameFieldParsingExecutor extends FIELDBaseListener {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/main/java/FIELD/";

    public List<Line> getMyLines() {
        try {
            // Get FIELD lexer
            FIELDLexer lexer = new FIELDLexer(new ANTLRInputStream(new FileInputStream(WORKING_DIRECTORY + "field.txt")));
            // Get a list of matched tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FIELDParser parser = new FIELDParser(tokens);
            // Specify our entry point
            FIELDParser.FieldContext fieldContext = parser.field();
            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            GameFieldModule listener = new GameFieldModule();
            walker.walk(listener, fieldContext);
            System.out.println("Returning get lines");
            System.out.println(listener.getMyLines());
            return listener.getMyLines();
        } catch (Exception ex) {
            System.err.println("Error reading playfield " +ex);
        }

        return null;
    }

    public void writeLineModel(List<Line> lines) throws IOException {
        final String OUTPUT_FILENAME = "field_model.txt";
        try{
            PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (Exception e) {
            // do something
        }

    }

    public void exitFile(FIELDParser.FieldContext ctx) {
        System.out.println("If no error outputs occurred, then file has valid format!");
        System.out.println(ctx.getText());
    }
}
