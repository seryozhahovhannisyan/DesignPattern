package seryozha.hovhannisyan.ocp.compare;

import java.util.*;

class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0) return result;
        return s1.getWeight() - s2.getWeight();
    }
}

class ChainingComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
        c = c.thenComparingInt(s -> s.getWeight());
        return c.compare(s1, s2);
    }
}

public class SquirrelTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Fluffy", c);
        System.out.println(index);

        Set<Squirrel> ducks = new TreeSet<>((o1, o2) -> o1.getSpecies().compareTo(o2.getSpecies()));
        Comparator<Squirrel> squirrelComparator = Comparator.comparing(s -> s.getSpecies());
        ducks = new TreeSet<>(squirrelComparator);
//        squirrelComparator = Comparator::comparing;
        ducks.add(new Squirrel("a"));
    }
}
