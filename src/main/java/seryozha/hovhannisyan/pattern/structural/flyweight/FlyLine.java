package seryozha.hovhannisyan.pattern.structural.flyweight;

import java.awt.*;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class FlyLine implements FlyShape {

    public FlyLine() {
        System.out.println("Creating Line object");
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}
