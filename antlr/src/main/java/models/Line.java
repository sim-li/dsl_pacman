package models;

import java.util.ArrayList;
import java.util.List;

public class Line {
    public List<Field> getFields() {
        return fields;
    }

    List<Field> fields = new ArrayList<Field>();

    public void addField(Field field) {
        fields.add(field);
    }

    public String toModelRepresentation() {
        String res = "{";
        for (Field f : fields) {
            if(f.isShip()) {
                res+="1,";
            } else {
                res+="0,";
            }
        }
        res = res.substring(0, res.length()-1);
        res += "}";
        return res;
    }
}
