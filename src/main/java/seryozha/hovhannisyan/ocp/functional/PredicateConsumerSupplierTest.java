package seryozha.hovhannisyan.ocp.functional;

import seryozha.hovhannisyan.ocp.functional.ref.Duck;
import seryozha.hovhannisyan.ocp.functional.ref.DuckHelper;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateConsumerSupplierTest {
    public static void main(String[] args) {
        Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        Comparator<Duck> byWeight2 =   DuckHelper::compareByWeight;


        // Predicate is a functional interface that takes a single parameter of any type and returns a boolean
        // Consumer , which takes a 1 parameter of any type and has a VOID RETURN type.
        // Supplier doesn’t take any 0 parameters and returns any type.

        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        List<Integer> aList = Arrays.asList(9, 7, 5, 3);
        Collections.sort( aList);

        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        methodRef1.accept(aList);
        methodRef1.andThen(lambda1).andThen(null);

        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList();

        methodRef4.get();

        System.out.println(LocalDate.now());


    }
}
