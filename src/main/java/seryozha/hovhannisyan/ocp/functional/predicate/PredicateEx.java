package seryozha.hovhannisyan.ocp.functional.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println("Abstract " + collect); // [6, 7, 8, 9, 10]
        //
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        collect = list.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());
        System.out.println("noGreaterThan5 " + collect); // [6, 7, 8, 9, 10]

        // multiple filters
        collect = list.stream().filter(x -> x > 5 && x < 8).collect(Collectors.toList());
        System.out.println("Abstract multiple " + collect);
        // Replace with Predicate.and()
        Predicate<Integer> noLessThan8 = x -> x < 8;
        collect = list.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());
        System.out.println("Multiple " + collect);
        //Predicate.or()
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");
        List<String> stringList = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collectStrings = stringList.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());
        System.out.println(collectStrings);
        //Predicate.negate()
        List<String> stringList1 = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        List<String> collect1 = stringList1.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());
        System.out.println(collect1);
        //
        System.out.println(StringProcessor.filter(collectStrings, x -> x.startsWith("A")));// [A, AA, AAA]
        System.out.println(StringProcessor.filter(collectStrings, x -> x.startsWith("A") && x.length() == 3)); // [AAA]


    }


}

class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }
}
