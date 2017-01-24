package ai.nodes;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private List<Node> nodes;

    private Node parent;

    public Node() {
        nodes = new ArrayList<Node>();
        if (!(this instanceof EmptyNode)) {
            parent = new EmptyNode();
        }
    }

    public boolean hasParent() {
        return parent instanceof EmptyNode;
    }

    public void addChild(Node node) {
        node.setParent(this);
        nodes.add(node);
    }

    public Node getChild(Node node) {
        final int index = nodes.indexOf(node);
        return nodes.get(index);
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
