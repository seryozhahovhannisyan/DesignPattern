package seryozha.hovhannisyan.hackerrank.spies_revised;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/red-knights-shortest-path/problem
 */
public class Solution {

    static List<Integer> stepMoves = new ArrayList<>();
    static List<Integer> skipColumn = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int column = 1;
        for (int i = 1; i <= n; i++) {
            if (column > n) {
                column = findStartColumn(i);
            }

            for (; column <= n; column++) {
                if (allow(column)) {
                    stepMoves.add(column);
                    skipColumn.add(column);
                    column += 2;
                    break;
                }
            }
        }
        System.out.println(n);
        for (int i = 0; i < stepMoves.size(); i++) {
            System.out.print(stepMoves.get(i) + " ");
        }
        scanner.close();

    }

    static int findStartColumn(int n) {
        Collections.sort(skipColumn);
        for (int i = 1; i < skipColumn.size(); i++) {
            if (i != skipColumn.get(i)) {
                return i;
            }
        }
        return 1;
    }

    static boolean allow(int i) {
        return !skipColumn.contains(i);
    }
}

