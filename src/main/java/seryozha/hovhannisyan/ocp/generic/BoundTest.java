package seryozha.hovhannisyan.ocp.generic;

import java.util.ArrayList;
import java.util.List;

public class BoundTest {
    public static void main(String[] args) {
//      Unbounded wildcard
//      ?
        List<?> l = new ArrayList<Integer>();
//      Wildcard with an upper bound
//      ? extends type
        List<? extends Exception> le = new ArrayList<RuntimeException>();
//      Wildcard with a lower bound
//      ? super type
        List<? super Exception> s = new  ArrayList<Object>();



    }
}
