import junit.framework.TestCase;
import java.io.IOException;

public class AiPassAndFailTests extends TestCase {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/testAis";

    public void testBasic() throws IOException {
        PacmanParserExecutor.parseAi(WORKING_DIRECTORY + "/random.ai");
    }
}
