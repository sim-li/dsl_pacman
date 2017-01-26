package ai.nodes;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    protected List<Node> nodes;

    protected Node parent;

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

    public abstract String renderCode();

    public String childCode() {
        String code = "";
        for (Node n : nodes) {
            code = code + n.renderCode();
        }
        return code;
    }

    public String withoutSemi(String code) {
        if(code.charAt(code.length() - 1) == ';') {
            code = code.substring(0, code.length() - 1);
        }
        return code;
    }

}
