package seryozha.hovhannisyan.ocp.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        Collections.sort(list);
        // [3, 5, 7, 9]
        System.out.println(Collections.binarySearch(list, 3)); // 0
        System.out.println(Collections.binarySearch(list, 2)); // -1
        System.out.println(Collections.binarySearch(list, 8)); // -4

        int[] numbers = {6, 9, 1, 8};
        Arrays.sort(numbers);
        // 1, 6, 8, 9
        System.out.println(Arrays.binarySearch(numbers, 6)); // 1
        // The number 3 would need to be inserted at index 1 (after the number 1 but before the number 6).
        // Negating that gives us -1 and subtracting 1 gives us -2.
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 17)); // -5
    }
}
