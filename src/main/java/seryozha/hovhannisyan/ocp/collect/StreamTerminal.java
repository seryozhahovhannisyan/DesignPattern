package seryozha.hovhannisyan.ocp.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);
        //
        //  Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
        //	at java.base/java.util.stream.ReferencePipeline.findAny(ReferencePipeline.java:548)
        //	at seryozha.hovhannisyan.ocp.collect.HakerRankCert.main(HakerRankCert.java:16)
        Integer findAny = stream.findAny().get();
        System.out.println(findAny);

        Integer findFirst = stream.findFirst().get();
        System.out.println(findFirst);
        //allMatch() , anyMatch() and noneMatch()
        boolean allMatch = stream.allMatch(a -> a > 3);
        System.out.println(allMatch);
        boolean anyMatch = stream.anyMatch(a -> a > 3);
        System.out.println(anyMatch);
        boolean noneMatch = stream.noneMatch(a -> a > 3);
        System.out.println(noneMatch);
        //


        // no terminate
        long count = stream.count();
        System.out.println(count);
        Integer min = stream.min((a, b) -> a.compareTo(b)).get();
        System.out.println(min);
        Integer max = stream.max((a, b) -> a.compareTo(b)).get();
        System.out.println(max);

    }
}
