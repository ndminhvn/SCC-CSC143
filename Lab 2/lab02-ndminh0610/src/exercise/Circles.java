package exercise;

import java.awt.*;

public class Circles implements Drawable, Fillable{
    private Color color;
    private Graphics pen;
    private int x;
    private int y;

    public Circles(Graphics _graphics) {
        pen = _graphics;
        color = new Color(255,255,255);
        x = 30;
        y = 5;
    }

    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        move(80, 80);
        color = Fillable.AQUA;
        draw(color);
    }

    @Override
    public void draw(Color color) {
        pen.setColor(color);
        for (int i = 1; i < 11; i++) {
            pen.drawOval(x, y, 20 * i, 20 * i);
        }
    }

    @Override
    public void fill(Color color) {
        move(50, 50);
        pen.setColor(color);
        for (int i = 1; i < 11; i++) {
            pen.fillOval(x, y, 10 * i, 10 * i);
        }
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
