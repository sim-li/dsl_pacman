package ai.nodes;

import java.util.ArrayList;
import java.util.List;

public class Random extends Node {
    final String numberRegex = "[0-9]+";
    List<Integer> ratios;

    public Random(List<String> ratios) {
        this.ratios = new ArrayList<Integer>();
        for (String r: ratios) {
            this.ratios.add(Integer.parseInt(r));
        }
    }

    @Override
    public String renderCode() {
        String code = "queries.randomWithDistribution([\n";
        for (int ratio: ratios) {
            code = code + Integer.toString(ratio) + ",";
        }
        code = code.substring(0, code.length() -1);
        code = code + "\n ], [" + "\n";
        for (Node n: nodes) {
            code += withoutSemi(n.renderCode()) + ",\n";
        }
        code = code.substring(0, code.length() - 2);
        code = code + "]);";

        return code;
    }

}
