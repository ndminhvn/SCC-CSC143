package trucks;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Truck {

    protected  Color    color;
    protected  Graphics pen;
    protected  int      size;
    protected  int      startX;
    protected  int      startY;

    //TODO: Update Class, you are expected to figure this out!

    public Truck(Graphics pen) {
        this.pen = pen;
    }

    public Truck(Graphics pen, Color color) {
        this.pen = pen;
        this.color = color;
        System.out.println("Truck");
        setLocation(25,25);
    }

    protected void drawWheel(int outerX, int outerY, int innerX, int innerY, int length) {
        pen.setColor(Color.BLACK);
        pen.fillOval(outerX, outerY, length, length);
        pen.setColor(Color.LIGHT_GRAY);
        pen.fillOval(innerX, innerY, length / 2, length / 2);

    }

    protected void drawWindow(int x, int y, int width, int height) {
        pen.setColor(Color.LIGHT_GRAY);
        pen.fillRect(x, y, width, height);
    }

    public void move(int dx, int dy) {
        this.startY += dx;
        this.startY += dy;
    }

    public void setLocation(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    public int setSize(int size) {
        this.size = size;
        return size;
    }

    public abstract void draw();

    public abstract void drawToScale(int length);
}
