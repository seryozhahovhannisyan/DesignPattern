package seryozha.hovhannisyan.ocp.nested;

import java.util.*;

public class StaticNestedClassTest {
    public static void main(String[] args) {
        StaticNestedClass.Nested n = new StaticNestedClass.Nested();
        HashMap m = new  HashMap();
        m.put("","");
        m.get("");
        m.keySet();//runtime
        m.values();
        m.entrySet();
        HashSet s = new HashSet();
        s.add("");
        Arrays.sort(new String[]{"", ""});

//        m.compute()
    }
}
