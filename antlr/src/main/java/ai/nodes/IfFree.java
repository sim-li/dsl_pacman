package ai.nodes;

public class IfFree extends Node {
    Node direction;

    public IfFree(String directionArrow) {
        direction = new Direction(directionArrow);
    }

    @Override
    public String renderCode() {
        String code = "if (queries.isFree(direction)) {\n" +
                "return " + childCode() + "\n" +
                "}";
        return code;
    }
}
