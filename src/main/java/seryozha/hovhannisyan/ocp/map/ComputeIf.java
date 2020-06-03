package seryozha.hovhannisyan.ocp.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeIf {

    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Jenny", "Tram");
        System.out.println(favorites); // {Jenny=Tram}


        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

        //
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        favorites.put("Jenny", "123456789");
        favorites.put("Tom", "1");
        String jenny = favorites.merge("Jenny", "1", mapper);
        String tom = favorites.merge("Tom", "12", mapper);
        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny);
//123456789
        System.out.println(tom);
// 123456789
        System.out.println(favorites.computeIfPresent("Tom", (k, v2) -> k.length() >= v2.length() ? k : v2));
        System.out.println(favorites.computeIfAbsent("Tomikjan", (k) -> k + " new val"));
        System.out.println(favorites);
        System.out.println("---");

        Map<String, Integer> counts = new HashMap<>();
        System.out.println(counts.put("Jenny", 1));
        System.out.println(counts.computeIfPresent("Jenny", (k, v) -> null));
        System.out.println(counts.computeIfAbsent("Sam", k -> null));

        System.out.println(counts.computeIfPresent("JennyJ", (k, v) -> 100));
        System.out.println(counts.computeIfAbsent("SamJ", k -> 200));
        System.out.println(counts); // {}

    }
}
