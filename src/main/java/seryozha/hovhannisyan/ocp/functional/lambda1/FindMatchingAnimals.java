package seryozha.hovhannisyan.ocp.functional.lambda1;

import static seryozha.hovhannisyan.ocp.functional.lambda1.CheckTrait.MAX_SPEED;
import java.util.function.Predicate;

@FunctionalInterface
interface CheckTrait0 {
    public boolean test();
}

@FunctionalInterface
interface CheckTrait {
    public static final int MAX_SPEED = 100;
    public boolean test(Animal a);
}

public class FindMatchingAnimals {

    /**
     * Java relies on context when figuring out what lambda expressions mean. We are
     * passing this lambda as the second parameter of the print() method. That method
     * expects a CheckTrait as the second parameter.
     *
     * Since we are passing a lambda instead,
     * Java treats CheckTrait as a functional interface and tries to map it to the single
     * abstract method:
     * boolean test(Animal a);
     *
     *
     * Recall that lambda expressions rely on the notion of deferred execution.
     * Deferred execution means that code is specified now but runs later. In this
     * case, later is when the print() method calls it. Even though the execution
     * is deferred, the compiler will still validate that the code syntax is properly
     * formed.
     *
     * @param animal
     * @param trait Is FunctionalInterface
     */
    private static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }

    private static void print(Animal animal, CheckTrait0 trait) {
        if (trait.test())
            System.out.println(animal);
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> true);


        print(new Animal("kangaroo", true, false), new CheckTrait() {
            @Override
            public boolean test(Animal a) {
//                body
                return a.canHop();
            }
        });


        print(new Animal("kangaroo4", true, false), () -> true);
        print(new Animal("kangaroo4", true, false), (Animal parameter) -> {
            //body
            return parameter.canHop() & MAX_SPEED > 0;
        });
    }
}


