import ai.AiBaseListenerImplementation;
import ai.generated.AiBaseListener;
import ai.generated.AiLexer;
import ai.generated.AiParser;
import ai.nodes.Node;
import level.LevelBaseListenerImplementation;
import level.generated.LevelLexer;
import level.generated.LevelParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class PacmanParserExecutor {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/antlr/src/main/java/level/";

    public static List<List> parseLevel() throws IOException {
        // Get CSV lexer
        final LevelLexer lexer = new LevelLexer(new ANTLRInputStream(new FileReader(WORKING_DIRECTORY + "paclevel1.csv")));
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
        return listener.getTotalValues();
    }

    public static ParsingResult<Node> parseAi(final String filePath) throws IOException {
        // Get CSV lexer
        final AiLexer lexer = new AiLexer(new ANTLRInputStream(new FileReader(filePath)));
        // Get a list of matched tokens
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        final AiParser parser = new AiParser(tokens);
        // Specify our entry point
        final AiParser.AiContext fieldContext = parser.ai();
        // Walk it and attach our listener
        final ParseTreeWalker walker = new ParseTreeWalker();
        final AiBaseListenerImplementation listener = new AiBaseListenerImplementation();
        walker.walk(listener, fieldContext);
        return new ParsingResult<Node>(listener.getRootNode(), parser);
    }

    public void exitFile(LevelParser.FieldContext ctx) {
        System.out.println(
                "If no error outputs occurred, then file has valid format!");
        System.out.println(ctx.getText());
    }
}