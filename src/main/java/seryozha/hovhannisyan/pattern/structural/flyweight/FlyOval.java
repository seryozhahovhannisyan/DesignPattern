package seryozha.hovhannisyan.pattern.structural.flyweight;

import java.awt.*;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class FlyOval implements FlyShape {

    //intrinsic property
    private boolean fill;

    public FlyOval(boolean f) {
        this.fill = f;
        System.out.println("Creating Oval object with fill=" + f);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
