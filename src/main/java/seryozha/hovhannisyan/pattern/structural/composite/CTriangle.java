package seryozha.hovhannisyan.pattern.structural.composite;

/**
 * Created by Seryozha on 1/29/2017.
 *
 * Composite design pattern leaf implements base component and these are the building block for the composite.
 * We can create multiple leaf objects such as Triangle, Circle etc.
 */
public class CTriangle implements CShape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
}
