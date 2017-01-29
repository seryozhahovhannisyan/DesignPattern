package seryozha.hovhannisyan.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class FlyShapeFactory {

    private static final HashMap<ShapeType, FlyShape> shapes = new HashMap<ShapeType, FlyShape>();

    public static FlyShape getShape(ShapeType type) {
        FlyShape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new FlyOval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new FlyOval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new FlyLine();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
