package seryozha.hovhannisyan.pattern.structural.decorator;

/**
 * Created by Seryozha on 1/29/2017.
 * <p>
 * Decorator – Decorator class implements the component interface
 * and it has a HAS-A relationship with the component interface.
 * The component variable should be accessible to the child decorator classes,
 * so we will make this variable protected.
 */
public class DCarDecorator implements DCar {

    protected DCar car;

    public DCarDecorator(DCar c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
