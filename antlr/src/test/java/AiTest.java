import junit.framework.TestCase;
import java.io.IOException;

public class AiTest extends TestCase {
    public void testBasic() throws IOException {
        PacmanParserExecutor.parseAi();
        assertEquals(true, false);
    }
}
