package seryozha.hovhannisyan.pattern.structural.bridge;

/**
 * Created by Seryozha on 1/29/2017.
 */
public abstract class BShape {

    //Composition - implementor
    protected BColor color;

    //constructor with implementor as input argument
    public BShape(BColor c) {
        this.color = c;
    }

    abstract public void applyColor();
}
