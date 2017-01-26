package ai.nodes;

public class IfContainer extends Node {
    @Override
    public String renderCode() {
        return "(function() {\n" + childCode() + "\n    })();";
    }
}
