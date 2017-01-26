package ai.nodes;

public class FilterFree extends Node{
    @Override
    public String renderCode() {
        String code = "queries.filterFree([\n";
        for (Node n: nodes) {
            code += withoutSemi(n.renderCode()) + ",\n";
        }
        code = code.substring(0, code.length() - 2);
        code = code + "]);";
        return code;
    }
}
