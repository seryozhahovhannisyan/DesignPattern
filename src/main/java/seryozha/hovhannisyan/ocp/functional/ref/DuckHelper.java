package seryozha.hovhannisyan.ocp.functional.ref;

public class DuckHelper {

    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByWeight(Duck d1, Duck d2, int i) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
