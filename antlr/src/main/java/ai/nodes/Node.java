package ai.nodes;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private List<Node> nodes;

    public Node() {
        nodes = new ArrayList<Node>();
    }

    public void addChild(Node node) {
        nodes.add(node);
    }

    public Node getChild(Node node) {
        final int index = nodes.indexOf(node);
        return nodes.get(index);
    }
}
