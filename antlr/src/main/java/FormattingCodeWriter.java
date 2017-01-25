import java.io.FileWriter;
import java.io.IOException;

public class FormattingCodeWriter {
    final String INDENT = "    ";
    final String LINE_BREAK = "\n";
    private FileWriter fileWriter;
    private int indentationLevel;
    StringBuilder output;


    public FormattingCodeWriter(final FileWriter fileWriter) {
        this.fileWriter = fileWriter;
        this.output = new StringBuilder();
        this.indentationLevel = -1;
    }

    public void append(String line) {
        boolean arrayBracket = false;
        if(line.matches(".*\\{.+\\},?\\s*")) {
            arrayBracket = true;
        }
        if(arrayBracket || line.matches(".+\\{\\s*")) {
            indentationLevel++;
        } else if(line.matches(".*\\}\\s*")) {
            indentationLevel--;
        }
        for (int i = 0; i < indentationLevel; i++) {
            output.append(INDENT);
        }
        output.append(line + "\n");
        if (arrayBracket) {
            indentationLevel--;
        }
    }

    public void blankLine() {
        output.append(LINE_BREAK);
    }

    public void append(String... lines) {
        for(String line : lines) {
            append(line);
        }
    }

    public void write() throws IOException {
        fileWriter.write(output.toString());
    }
}
