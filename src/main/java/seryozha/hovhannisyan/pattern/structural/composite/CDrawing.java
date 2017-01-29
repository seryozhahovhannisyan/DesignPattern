package seryozha.hovhannisyan.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Seryozha on 1/29/2017.
 * <p>
 * A composite object contains group of leaf objects and
 * we should provide some helper methods to add or delete leafs from the group.
 * We can also provide a method to remove all the elements from the group.
 */
public class CDrawing implements CShape {

    //collection of Shapes
    private List<CShape> shapes = new ArrayList<CShape>();

    @Override
    public void draw(String fillColor) {
        for (CShape sh : shapes) {
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(CShape s) {
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(CShape s) {
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
