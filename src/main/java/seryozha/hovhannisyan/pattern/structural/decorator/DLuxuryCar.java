package seryozha.hovhannisyan.pattern.structural.decorator;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class DLuxuryCar extends DCarDecorator {

    public DLuxuryCar(DCar c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
