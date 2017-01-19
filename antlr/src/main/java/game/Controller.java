package game;

import ai.generated.AiBuilder;
import field.generated.PlayFieldBuilder;
import codegenerator.MyCodeGenerator;
import codegenerator.AiArrayStrategy;
import codegenerator.GameboardArrayStrategy;
import generatedSources.AiMovesBuilder;
import generatedSources.GameFieldBuilder;
import generatedSources.AiMovesBuilder;

import java.io.IOException;

public class Controller {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println("Starting code generation...");
        //final String modelName, final ArrayGenerationStrategy arrayStrategy
        final MyCodeGenerator codeGenerator = new MyCodeGenerator();
        //
        codeGenerator.createJavaFile("GameField", new GameboardArrayStrategy());
        codeGenerator.createJavaFile("AiMoves", new AiArrayStrategy());
        System.out.println("Finished code generation... starting game...");
        Game game = new Game(
            GameFieldBuilder.createGameField(),
            //PlayFieldBuilder.createPlayfield(),
            AiMovesBuilder.createAiMoves()
        );
        game.play();
    }
}