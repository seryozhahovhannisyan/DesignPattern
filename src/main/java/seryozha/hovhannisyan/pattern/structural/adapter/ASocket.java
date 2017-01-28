package seryozha.hovhannisyan.pattern.structural.adapter;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class ASocket {

    public AVolt getVolt() {
        return new AVolt(120);
    }

}
