package seryozha.hovhannisyan.pattern.behavioral.state;


/**
 * First of all we will create State interface that will define the method that should be implemented by
 * different concrete states and context class.
 */
public interface State {
    public void doAction();
}
