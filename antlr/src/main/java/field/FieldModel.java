//package field;
//import models.AiMove;
//import models.Field;
//import models.Line;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FieldModel {
//    final List<Line> lines = new ArrayList<Line>();
//
//    public FieldModel() {
//    }
//
//    public AiMove addLine(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
//        final Line line = new Line();
//        final Field fieldA = buildField(a);
//        final Field fieldB = buildField(b);
//        final Field fieldC = buildField(c);
//        final Field fieldD = buildField(d);
//        final Field fieldE = buildField(e);
//        final Field fieldF = buildField(f);
//        final Field fieldG = buildField(g);
//        line.addField(fieldA);
//        line.addField(fieldB);
//        line.addField(fieldC);
//        line.addField(fieldD);
//        line.addField(fieldE);
//        line.addField(fieldF);
//        line.addField(fieldG);
//        lines.add(line);
//    }
//
//    public Field buildField(boolean isShip) {
//        Field f = new Field();
//        if (isShip) {
//            f.setIsShip();
//        }
//        return f;
//    }
//
//    public List<Line> getMyLines() {
//        return lines;
//    }
//}
