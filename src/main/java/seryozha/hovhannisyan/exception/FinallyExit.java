package seryozha.hovhannisyan.exception;

public class FinallyExit {
    public static void main(String[] args) {
        try {
            System.out.println("try before exit");
            System.exit(400);
            System.out.println("try after exit");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End");
    }
}
