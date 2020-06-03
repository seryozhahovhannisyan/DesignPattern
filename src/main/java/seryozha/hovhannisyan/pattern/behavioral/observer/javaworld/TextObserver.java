package seryozha.hovhannisyan.pattern.behavioral.observer.javaworld;

import java.util.Observable;
import java.util.Observer;

public class TextObserver implements Observer {
    private ObservableValue ov = null;

    public TextObserver(ObservableValue ov) {
        this.ov = ov;
    }

    @Override
    public void update(Observable obs, Object obj) {
        System.out.println("TextObserver " + ov.getValue());
        if (obs == ov) {
            System.out.println(ov.getValue());
        }
    }
}