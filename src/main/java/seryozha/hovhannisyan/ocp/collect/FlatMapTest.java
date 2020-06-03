package seryozha.hovhannisyan.ocp.collect;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        String[][] data = new String[][]{
                {"a", "b"}, {"c", "d", "c", "d"}, {"e", "f", "e", "f", "e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        stringStream.forEach(System.out::println);
        System.out.println("---");
        temp = Arrays.stream(data);
        temp.forEach(array->{
            System.out.println(array.length); // 2,4, 6
        });

		/*Stream<String> stream = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));*/
    }
}
