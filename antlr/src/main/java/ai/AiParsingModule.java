package ai;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import models.AiMove;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class AiParsingModule extends AIBaseListener {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/main/java/AI/";

    public void exitAi(AIParser.AiContext ctx) {
    }
}
