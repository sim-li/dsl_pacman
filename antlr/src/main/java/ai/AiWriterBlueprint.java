//package ai;
//
//import models.AiMove;
//
//import java.util.List;
//
//public class AiWriterBlueprint {
//    final List<AiMove> aiMoves = new ArrayList<AiMove>();
//
//    public AiWriterBlueprint() {
//        addAiMove(1,2,true);
//    }
//
//    public AiMove addAiMove(int xCord, int yCord, boolean random) {
//        final AiMove aiMove = new AiMove();
//        aiMove.setXCord(xCord);
//        aiMove.setYCord(yCord);
//        if(random) {
//            aiMove.setRandom();
//        }
//        aiMoves.add(aiMove);
//    }
//
//    public List<AiMove> getAiMoves() {
//        return aiMoves;
//    }
//}
