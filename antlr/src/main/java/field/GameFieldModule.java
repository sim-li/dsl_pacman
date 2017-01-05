package field;

import models.Line;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.List;

public class GameFieldModule extends FIELDBaseListener {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/main/java/FIELD/";


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
