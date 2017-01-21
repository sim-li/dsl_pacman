import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Codegen extends FieldBaseListener {

    public static void main(String[] args) throws FileNotFoundExeption, IOExeption {
        // Get CSV lexer
        FieldLexer lexer = new FieldLexer(new ANTLRInputStream(new FileReader("paclevel1.csv")));
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        FieldParser parser = new levelfieldParser(tokens);
        // Specify our entry point
        FieldParser.FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        FieldListener listener = new Main();
        walker.walk(listener, fileContext);
    }
    public void exitFile(Field.FileContext ctx) {
        System.out.println(
                "If no error outputs occurred, then file has valid format!");
        System.out.println(ctx.getText());
    }
}