package ai.nodes;

public class Else extends Node {
    @Override
    public String renderCode() {
        return "else {\nreturn " + childCode() + "\n }";
    }
}
