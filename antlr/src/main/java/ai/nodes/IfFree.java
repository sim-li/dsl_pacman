package ai.nodes;

public class IfFree extends Node {
    Node direction;

    public IfFree(String directionArrow) {
        direction = new Direction(directionArrow);
    }

    @Override
    public String renderCode() {
        return "";
    }
}
