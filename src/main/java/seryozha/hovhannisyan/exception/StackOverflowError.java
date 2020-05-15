package seryozha.hovhannisyan.exception;

public class StackOverflowError {

    public static void main(String[] args) {

    }

    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }
}
