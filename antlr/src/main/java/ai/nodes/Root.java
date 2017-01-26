package ai.nodes;

public class Root extends Node {
    private String aiName;

    public Root(final String aiName) {
        super();
        this.aiName = aiName;
    }

    public String getName(String name) {
        return aiName;
    }

    @Override
    public String renderCode() {
        return "abc";
    }
}
