package seryozha.hovhannisyan.pattern.structural.decorator;

/**
 * Created by Seryozha on 1/29/2017.
 *
 * Single Responsibility Principle,
 * https://www.decipherzone.com/blog-detail/decorator-design-pattern-java-example
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
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
