package seryozha.hovhannisyan.pattern.structural.flyweight;

import java.awt.*;

/**
 * Created by Seryozha on 1/29/2017.
 */
public interface FlyShape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
