package seryozha.hovhannisyan.pattern.structural.bridge;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class BRectangle extends BShape {

    public BRectangle(BColor c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Rectangle filled with color ");
        color.applyColor();
    }
}
