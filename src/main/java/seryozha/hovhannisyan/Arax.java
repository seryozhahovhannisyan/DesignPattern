package seryozha.hovhannisyan;

public class Arax {

    public static void main(String[] args) {


        int n = 3;
        for (int i = 1; i <= n; i++) {

        }


//        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < 2) {
                    System.out.print(i);
                } else if (j < 2) {
                    System.out.print(i);

                } else {
                    System.out.print(1);
                }
                System.out.print("2");
            }
            System.out.println();
        }
        System.out.println("1");
    }
}
