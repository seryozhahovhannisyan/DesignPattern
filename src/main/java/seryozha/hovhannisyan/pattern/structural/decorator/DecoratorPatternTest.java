package seryozha.hovhannisyan.pattern.structural.decorator;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class DecoratorPatternTest {
    public static void main2(String[] args) {
        DCar sportsCar = new DSportsCar(new DBasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        DCar sportsLuxuryCar = new DSportsCar(new DLuxuryCar(new DBasicCar()));
        sportsLuxuryCar.assemble();

        System.out.println("\n*****");

        DCar luxuryCar = new DLuxuryCar(new DBasicCar());
        luxuryCar.assemble();
    }
}
