import org.antlr.v4.runtime.Parser;

public class ParsingResult<T> {
    private T result;
    private int numberOfSyntaxErrors;

    public ParsingResult(T result, Parser parser) {
        this.result = result;
        this.numberOfSyntaxErrors = parser.getNumberOfSyntaxErrors();
    }

    public T getResult() {
        return result;
    }

    public int getNumberOfSyntaxErrors() {
        return this.numberOfSyntaxErrors;
    }
}
