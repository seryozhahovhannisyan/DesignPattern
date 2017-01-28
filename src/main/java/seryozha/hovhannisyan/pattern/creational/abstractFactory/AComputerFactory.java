package seryozha.hovhannisyan.pattern.creational.abstractFactory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class AComputerFactory {
    public static AComputer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
