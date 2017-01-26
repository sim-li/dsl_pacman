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
        String code = "" +
                "define([], function () {\n" +
                "    var strategy = function(queries) {\n"+
                "       var direction = queries.currentDirection();\n"+
                "       return " + childCode() +
                "\n    }\n"+
                "    return strategy;\n" +
                "});\n";
        return code;
    }
}
