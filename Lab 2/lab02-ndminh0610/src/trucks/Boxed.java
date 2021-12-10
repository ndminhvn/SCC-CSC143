package trucks;

import java.awt.Color;
import java.awt.Graphics;

public class Boxed extends Truck {

    //TODO: Update Class, you are expected to figure this out!
    protected static final Color DEFAULT_COLOR = new Color(250,185,0);

    public Boxed(Graphics pen) {
        super(pen, DEFAULT_COLOR);
    }

    public Boxed(Graphics pen, Color color) {
        super(pen,DEFAULT_COLOR);
        System.out.println("Boxed");
    }

    @Override
    public void draw(){
        int outerXLeft  = startX + 10;
        int outerXRight = startX + 70;
        int outerY      = startY + 40;
        int innerXLeft  = startX + 15;
        int innerXRight = startX + 75;
        int innerY      = startY + 45;
        int windowX     = startX + 70;
        int windowY     = startY + 10;

        drawBody(100, 50);
        drawWheel(outerXLeft, outerY, innerXLeft, innerY, 20);         // left wheel
        drawWheel(outerXRight, outerY, innerXRight, innerY, 20);       // right wheel
        drawWindow(windowX, windowY, 30, 20);
    }

    private void drawBody(int width, int height){
        pen.setColor(DEFAULT_COLOR);
        pen.fillRect(startX, startY, width, height);
    }

    @Override
    public void drawToScale(int length) {

        setSize(length);

        int outerXLeft  = startX + size / 10;           // x for left wheel
        int outerXRight = startX + 7 * size / 10;       // x for right wheel
        int outerY      = startY + 2 * size / 5;        // y for wheels
        int innerXLeft  = startX + 3 * size / 20;       // x for left hubcap
        int innerXRight = startX + 3 * size / 4;        // x for right hubcap
        int innerY      = startY + 9 * size / 20;       // y for hubcaps
        int windowX     = startX + 7 * size / 10;
        int windowY     = startY + size / 10;
        int windowWidth = 3 * size / 10;

        drawBody(size, size / 2);
        drawWheel(outerXLeft,outerY, innerXLeft, innerY, size / 5);
        drawWheel(outerXRight,outerY, innerXRight, innerY, size / 5);
        drawWindow(windowX, windowY, windowWidth, size / 6);
    }

}
