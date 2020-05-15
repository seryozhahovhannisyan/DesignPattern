package seryozha.hovhannisyan.pattern.behavioral.state;

/**
 * State Design Pattern Concrete State Implementations
 * In our example, we can have two states – one for turning TV on and another to turn it off.
 * So we will create two concrete state implementations for these behaviors.
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}