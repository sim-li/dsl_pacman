package codegenerator;

import ai.AiParsingExecutor;
import models.AiMove;

public class AiArrayStrategy implements ArrayGenerationStrategy {
    public String getArrayContent() {
        AiParsingExecutor aiParsingExecutor = new AiParsingExecutor();
        String movesArray = "";
        for (AiMove a : aiParsingExecutor.getMoves()) {
            movesArray += a.toModelRepresentation() + ",";
        }
        movesArray = movesArray.substring(0, movesArray.length()-1);
        return movesArray;
    }

    public String getArrayType() {
        return "String []";
    }
}
