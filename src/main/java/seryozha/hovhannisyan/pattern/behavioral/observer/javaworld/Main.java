package seryozha.hovhannisyan.pattern.behavioral.observer.javaworld;

// https://www.javaworld.com/article/2077258/observer-and-observable.html
public class Main {
    public Main() {
        ObservableValue ov = new ObservableValue(0);
        TextObserver to = new TextObserver(ov);
        ov.addObserver(to);

        ov.setValue(45);
        ov.changed();
        ov.notifyObservers();
        System.out.println("B");
        ov.notifyObservers();
        System.out.println("A");

        System.out.println("B2");
        ov.changed();
        ov.notifyObservers();
        System.out.println("Aa");

    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}