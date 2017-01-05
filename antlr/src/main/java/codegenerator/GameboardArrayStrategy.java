package codegenerator;
import field.GameFieldParsingExecutor;
import models.Line;

public class GameboardArrayStrategy implements ArrayGenerationStrategy {
    public String getArrayContent() {
        GameFieldParsingExecutor gameFieldParsingExecutor = new GameFieldParsingExecutor();
        String result = "";
        for (Line l : gameFieldParsingExecutor.getMyLines()) {
            if (l.getFields().size() <=0) {
                result += "{0,0,0,0,0,0,0},";
            } else {
                result += l.toModelRepresentation() + ",";
            }
        }
        result = result.substring(0, result.length()-1);
        return result;
    }

    public String getArrayType() {
        return "int[][]";
    }
}
