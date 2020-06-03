package seryozha.hovhannisyan.ocp.functional.lambda1;

import java.util.function.Predicate;

import static seryozha.hovhannisyan.ocp.functional.lambda1.CheckTrait.MAX_SPEED;

public class FindMatchingAnimalsPredicate {

    private static void print(Animal animal, Predicate<Animal> trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {

        Predicate<Integer> noGreaterThan5 =  x -> x > 5;

        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> true);
        print(new Animal("kangaroo4", true, false), (Animal parameter) -> {
            //body
            return parameter.canHop() & MAX_SPEED > 0;
        });
    }
}


