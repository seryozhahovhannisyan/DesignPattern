package seryozha.hovhannisyan.pattern.structural.decorator;

/**
 * Created by Seryozha on 1/29/2017.
 *
 * Component Implementation –
 * The basic implementation of the component interface.
 * We can have BasicCar class as our component implementation.
 */
public class DBasicCar implements DCar {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
