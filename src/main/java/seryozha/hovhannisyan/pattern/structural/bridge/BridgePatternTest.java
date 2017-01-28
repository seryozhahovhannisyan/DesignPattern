package seryozha.hovhannisyan.pattern.structural.bridge;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        BShape tri = new BTriangle(new BRedColor());
        tri.applyColor();

        BShape pent = new BRectangle(new BGreenColor());
        pent.applyColor();
    }
}
