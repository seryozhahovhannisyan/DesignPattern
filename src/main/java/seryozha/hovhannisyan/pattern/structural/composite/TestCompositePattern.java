package seryozha.hovhannisyan.pattern.structural.composite;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class TestCompositePattern {
    public static void main(String[] args) {
        CShape tri = new CTriangle();
        CShape tri1 = new CTriangle();
        CShape cir = new COval();

        CDrawing drawing = new CDrawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");
        System.out.println(drawing);

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
        System.out.println(drawing);
    }
}
