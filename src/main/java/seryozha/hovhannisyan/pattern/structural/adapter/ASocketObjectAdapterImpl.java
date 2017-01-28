package seryozha.hovhannisyan.pattern.structural.adapter;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class ASocketObjectAdapterImpl implements ASocketAdapter {

    //Using Composition for adapter pattern
    private ASocket sock = new ASocket();

    @Override
    public AVolt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public AVolt get12Volt() {
        AVolt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public AVolt get3Volt() {
        AVolt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    private AVolt convertVolt(AVolt v, int i) {
        return new AVolt(v.getVolts() / i);
    }
}
