package seryozha.hovhannisyan.ocp.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> op = (a, b) -> a + b;
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, op, op)); // 15 = 1 + 3 + 5 + 6
        System.out.println(Stream.of(3, 5, 6).reduce(1, op)); // 15 = 1 + 3 + 5 + 6
        System.out.println(Stream.of(3, 5, 6).reduce(op).get()); // 14 = 3 + 5 + 6

        List<Integer> list = Arrays.asList(3, 5, 6);
        int sum = 1;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum); //15
        // todo
        StringBuilder word = Stream.of("w", "o", "l", "f").collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);
        StringBuilder sb = new StringBuilder();
        // todo
        sb = Stream.of('w', 'o').reduce(sb, StringBuilder::append, StringBuilder::append);
        System.out.println(sb);

        Set set = Stream.of("w", "o", "l", "f").collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
        set = Stream.of("w", "o", "l", "f").collect(Collectors.toSet());
        System.out.println(set);
    }
}
