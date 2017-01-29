package seryozha.hovhannisyan.pattern.structural.decorator;

/**
 * Created by Seryozha on 1/29/2017.
 * <p>
 * Concrete Decorators – Extending the base decorator functionality
 * and modifying the component behavior accordingly.
 * We can have concrete decorator classes as LuxuryCar and SportsCar.
 */
public class DSportsCar extends DCarDecorator {

    public DSportsCar(DCar c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
