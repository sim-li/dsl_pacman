import ai.generated.AiBaseListener;
import ai.generated.AiLexer;
import ai.generated.AiParser;
import level.LevelBaseListenerImplementation;
import level.generated.LevelLexer;
import level.generated.LevelParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

public class PacmanParserExecutor {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/main/java/";

    public static void main(String[] args) throws IOException {
        //parseLevel();
        //parseAi(WORKING_DIRECTORY + "strategies/random.ai");
    }

    public static void parseLevel() throws IOException {
        // Get CSV lexer
        final LevelLexer lexer = new LevelLexer(new ANTLRInputStream(new FileReader(WORKING_DIRECTORY + "level/paclevel1.csv")));
        // Get a list of matched tokens
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        final LevelParser parser = new LevelParser(tokens);
        // Specify our entry point
        final LevelParser.FieldContext fieldContext = parser.field();
        // Walk it and attach our listener
        final ParseTreeWalker walker = new ParseTreeWalker();
        final LevelBaseListenerImplementation listener = new LevelBaseListenerImplementation();
        walker.walk(listener, fieldContext);
    }

    public static void parseAi(final String filePath) throws IOException {
        // Get CSV lexer
        final AiLexer lexer = new AiLexer(new ANTLRInputStream(new FileReader(filePath)));
        // Get a list of matched tokens
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        final AiParser parser = new AiParser(tokens);
        // Specify our entry point
        final AiParser.AiContext aiContext = parser.ai();
        // Walk it and attach our listener
        final ParseTreeWalker walker = new ParseTreeWalker();
        final AiBaseListener listener = new AiBaseListener();
        walker.walk(listener, aiContext);
    }

    public void exitFile(LevelParser.FieldContext ctx) {
        System.out.println(
                "If no error outputs occurred, then file has valid format!");
        System.out.println(ctx.getText());
    }
}