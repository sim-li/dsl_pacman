package ai;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import models.AiMove;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class AiParsingExecutor extends AIBaseListener {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/main/java/AI/";

    public List<AiMove> getMoves() {
        try {
            // Get AI lexer
            AILexer lexer = new AILexer(new ANTLRInputStream(new FileInputStream(WORKING_DIRECTORY + "ai_instructions.txt")));
            // Get a list of matched tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AIParser parser = new AIParser(tokens);
            // Specify our entry point
            AIParser.AiContext fileContext = parser.ai();
            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            AIBaseListener listener = new AiParsingModule();
            walker.walk(listener, fileContext);
            return listener.getAiMoves();
        } catch (IOException ex) {
            ;
        }
        return null;
    }

    public void exitAi(AIParser.AiContext ctx) {
    }
}
