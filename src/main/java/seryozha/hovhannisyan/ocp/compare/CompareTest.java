package seryozha.hovhannisyan.ocp.compare;

import java.util.Comparator;

public class CompareTest {

    public static void main(String[] args) {
        AComparableObj obj = new AComparableObj("a", "bc");


        Comparator<AComparableObj> byDesc = (o1, o2) -> {
            return o1.desc.compareTo(o2.desc);
        };
    }

}
