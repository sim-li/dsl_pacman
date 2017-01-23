import junit.framework.TestCase;
import java.io.IOException;

public class AiPassAndFailTests extends TestCase {
    final String USER_DIR = System.getProperty("user.dir");
    final String WORKING_DIRECTORY = USER_DIR + "/src/test/java/testAis";
    boolean recompiledGrammar = false;

    public void testRandomWithNestedFilterFreeN() throws IOException {
        recompileGrammar();
        parseAndAssertNoError("randomFilterFreeN");
    }

    public void testIfStatementWithMoves() throws IOException {
        recompileGrammar();
        parseAndAssertNoError("ifStatementWithMoves");
    }

    public void testCompleteCase() throws IOException {
        recompileGrammar();
        parseAndAssertNoError("completeCase");
    }

    public void recompileGrammar() {
        if (recompiledGrammar) {
            return;
        }
        if (recompiledGrammar == false) {
            recompiledGrammar = true;
        }
        try {
            System.out.println("Recompiling grammar...");
            Process p = Runtime.getRuntime().exec(USER_DIR + "/build.sh");
            System.out.println("Grammar recompiled.");
            p.waitFor();
        } catch (InterruptedException interruptedException) {
            System.out.println("Got interrupted exception running grammar compile script");
        } catch (IOException ioException) {
            System.out.println("Got io exception running grammar compile script");
        }
    }

    public void parseAndAssertNoError(String name) {
        try {
            final ParsingResult parsingResult = PacmanParserExecutor.parseAi(buildPath(name));
            assertEquals(parsingResult.getNumberOfSyntaxErrors(), 0);
        } catch (IOException ioEx) {
            fail("IO Exception reading test " + name);
        }
    }

    public void parseAndAssertError(String name) {
        try {
            final ParsingResult parsingResult = PacmanParserExecutor.parseAi(buildPath(name));
            assertTrue(parsingResult.getNumberOfSyntaxErrors() > 0);
        } catch (IOException ioEx) {
            fail("IO Exception reading test " + name);
        }
    }

    public String buildPath(String name) {
        return WORKING_DIRECTORY + "/" + name + ".ai";
    }

}
