package seryozha.hovhannisyan.pattern.structural.bridge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class BridgePatternTest {
    public static void main2(String[] args) {
        BShape tri = new BTriangle(new BRedColor());
        tri.applyColor();

        Map<String, BridgePatternTest> tm = new TreeMap<>();
        tm.put("abc", new BridgePatternTest());

        BShape pent = new BRectangle(new BGreenColor());
        pent.applyColor();

        Collections.synchronizedList(Arrays.asList(1));
    }
}
