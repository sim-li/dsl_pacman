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
        return "";
    }
}
