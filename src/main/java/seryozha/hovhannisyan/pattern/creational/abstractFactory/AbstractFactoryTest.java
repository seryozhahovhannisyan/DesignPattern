package seryozha.hovhannisyan.pattern.creational.abstractFactory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class AbstractFactoryTest {
    public static void main2(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        AComputer pc     = AComputerFactory.getComputer(new APCFactory("2 GB", "500 GB", "2.4 GHz"));
        AComputer server = AComputerFactory.getComputer(new AServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
