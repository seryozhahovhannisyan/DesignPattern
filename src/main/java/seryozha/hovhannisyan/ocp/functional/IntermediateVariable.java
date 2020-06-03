package seryozha.hovhannisyan.ocp.functional;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.*;

public class IntermediateVariable {
    public static void main(String[] args) {

        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
//        Supplier<String> s3 = () -> String.format("", "");

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);
        //
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie 1");
        c2.accept("Annie 2");
        //
        Map<String, Integer> map = new HashMap<>();

        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);
        //
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("1"));
        System.out.println(p2.test(""));
        //
        BiPredicate<String, String> b1p = String::startsWith;
        BiPredicate<String, String> b2p = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b1p.test("chicken", "chick"));
        System.out.println(b2p.test("chicken", "chick2"));
        //

        // A Function is responsible for turning one parameter into a value of a potentially different
        // type and returning it.
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));
        // 5
        // 5


        BiFunction<String, String, String> b1f = String::concat;
        BiFunction<String, String, String> b2f = (string, toAdd) -> string.concat(toAdd);
        BiFunction<String, String, Integer> b3f = (string, toAdd) -> string.length() + toAdd.length();
        System.out.println(b1f.apply("baby ", "chick")); // baby chick
        System.out.println(b2f.apply("baby ", "chick")); // baby chick
        System.out.println(b3f.apply("5", "5")); // 2

        // They require all type parameters to be the same type.
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));
        //
        BinaryOperator<String> b1o = String::concat;
        BinaryOperator<String> b2o = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1o.apply("baby ", "chick")); // baby chick
        System.out.println(b2o.apply("baby ", "chick")); // baby chick


        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");

        TreeSet treeSet = new TreeSet();
        treeSet.add(1);

    }
}
