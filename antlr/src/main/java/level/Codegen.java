package level;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Codegen extends LevelBaseListener {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/main/java/level/";

    public static void main(String[] args) throws IOException {
        // Get CSV lexer
        LevelLexer lexer = new LevelLexer(new ANTLRInputStream(new FileReader(WORKING_DIRECTORY + "paclevel1.csv")));
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        LevelParser parser = new LevelParser(tokens);
        // Specify our entry point
        LevelParser.FieldContext fileContext = parser.field();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        LevelBaseListener listener = new LevelBaseListener();
        walker.walk(listener, fileContext);
    }

    public void exitFile(LevelParser.FieldContext ctx) {
        System.out.println(
                "If no error outputs occurred, then file has valid format!");
        System.out.println(ctx.getText());
    }
}