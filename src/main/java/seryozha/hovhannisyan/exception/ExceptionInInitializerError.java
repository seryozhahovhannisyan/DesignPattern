package seryozha.hovhannisyan.exception;

public class ExceptionInInitializerError {
    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }

    public static void main(String[] args) {

    }
}
