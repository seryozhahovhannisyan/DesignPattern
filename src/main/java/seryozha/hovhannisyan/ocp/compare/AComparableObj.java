package seryozha.hovhannisyan.ocp.compare;


/**
 * We said that Comparator is a functional interface because it has a single abstract method.
 * Comparable is also a functional interface since it also has a single abstract method. How-
 * ever, using a lambda for Comparable would be silly. The point of Comparable is to imple-
 * ment it inside the object being compared.
 */
public class AComparableObj implements Comparable<AComparableObj> {

    String name;
    String desc;

    public AComparableObj(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public int compareTo(AComparableObj o) {
        return name.length() - o.name.length();
    }
}
