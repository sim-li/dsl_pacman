package ai.nodes;

public class FilterFreeN extends Node {
    private int n;

    public FilterFreeN(String n) {
        super();
        this.n = Integer.parseInt(n);
    }

    @Override
    public String renderCode() {
        String code = "queries.filterFreeN(" + n + ", [\n";
        for (Node n: nodes) {
            code += withoutSemi(n.renderCode()) + ",\n";
        }
        code = code.substring(0, code.length() - 2);
        code = code + "]);";
        return code;
    }
}
