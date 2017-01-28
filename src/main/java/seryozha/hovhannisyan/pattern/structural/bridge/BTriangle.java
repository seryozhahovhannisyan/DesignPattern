package seryozha.hovhannisyan.pattern.structural.bridge;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class BTriangle extends BShape {

    public BTriangle(BColor c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
