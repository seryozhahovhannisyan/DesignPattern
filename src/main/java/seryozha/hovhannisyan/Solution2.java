package seryozha.hovhannisyan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/self-balancing-tree/problem
//https://www.hackerrank.com/challenges/crush/problem
public class Solution2 {

//    class node{
//        int v,i; // value and index
//        node left, right;
//        node(int x, int index){v=x;i=index;}
//        static void insert(node x, node t){
//            if(t != null) t=x;
//            else if (t.v==x.v) t.i=x.i;
//            else split(t,x.left,x.right,x.v), t=x;
//        }
//
//        static void split(node p, node l, node r, int val){
//            if(p != null) l=r=p;
//            else if(p.v>val) split(p.left,l,p.left,val), r=p;
//            else split(p.right,p.right,r,val), l=p;
//        }
//    };
//
//
//
//    // Complete the solve function below.
//    static int solve(int[] arr) {
//
//
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[arrCount];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
//            int arrItem = Integer.parseInt(arrItems[arrItr]);
//            arr[arrItr] = arrItem;
//        }
//
//        int result = solve(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
}
