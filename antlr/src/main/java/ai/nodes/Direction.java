package ai.nodes;

import java.util.HashMap;
import java.util.Map;

public class Direction extends Node {
    private String direction;

    public Direction(String direction) {
        super();
        final Map<String, String> directionMapping = new HashMap();
        directionMapping.put("->", "CURRENT");
        directionMapping.put("<-", "OPPOSITE");
        directionMapping.put("=>", "ALTERNATIVE");
        directionMapping.put("<=", "ALTERNATIVE_OPPOSITE");
        this.direction = directionMapping.get(direction);
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String renderCode() {
        if (direction.equals("CURRENT")) {
            return "direction";
        } else if (direction.equals("OPPOSITE")) {
            return "queries.opposite(direction)";
        } else if (direction.equals("ALTERNATIVE")) {
            return "queries.alternative(direction)";
        } else if (direction.equals("ALTERNATIVE_OPPOSITE")) {
            return "queries.alternativeOpposite(direction)";
        }
        return "ERROR, EMPTY DIRECTION";
    }
}
