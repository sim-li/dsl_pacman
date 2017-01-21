package csv;

import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvMain extends CSVBaseListener {
    final static String WORKING_DIRECTORY = System.getProperty("user.dir") + "/src/main/java/csv/";

    public static void main(String[] args) throws IOException {
        // Get CSV lexer
        CSVLexer lexer = new CSVLexer(new ANTLRInputStream(new FileInputStream(WORKING_DIRECTORY + "test_valid.csv")));
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);
        // Specify our entry point
        CSVParser.FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        CSVBaseListener listener = new CsvMain();
        walker.walk(listener, fileContext);
    }

    public void exitFile(CSVParser.FileContext ctx) {
        System.out.println("If no error outputs occurred, then file has valid format!");
        System.out.println(ctx.getText());
    }
}
