package trucks;

import java.awt.Color;
import java.awt.Graphics;

public class FlatBed extends Truck {

    //TODO: Update Class, you are expected to figure this out!
    protected static final Color DEFAULT_COLOR = new Color(125,180,250);

    public FlatBed(Graphics pen) {
        super(pen,DEFAULT_COLOR);
    }

    public FlatBed(Graphics pen, Color color) {
        super(pen,DEFAULT_COLOR);
        System.out.println("Flat Bed");
    }

    @Override
    public void draw(){
        int outerXLeft  = startX + 10;
        int outerXRight = startX + 70;
        int outerY      = startY + 5;
        int innerXLeft  = startX + 15;
        int innerXRight = startX + 75;
        int innerY      = startY + 10;
        int windowX     = startX + 60;
        int windowY     = startY - 15;

        drawFlatBedBody(startX , startY);
        drawWheel(outerXLeft, outerY, innerXLeft, innerY, 20);      // left wheel
        drawWheel(outerXRight, outerY, innerXRight, innerY, 20);    // right wheel
        drawWindow(windowX, windowY, 30, 15);
    }

    private void drawFlatBedBody(int x, int y){
        pen.setColor(DEFAULT_COLOR);
        pen.fillRect(x, y, 100, 15);
        pen.fillRect(x + 50, y - 20, 50, 30);
    }

    private void drawResizedBody(int x, int y){
        pen.setColor(DEFAULT_COLOR);
        pen.fillRect(x, y, size, size / 6);
        pen.fillRect(x + size / 2, y - size / 4, size / 2, 7 * size / 20);
    }

    @Override
    public void drawToScale(int length) {

        setSize(length);

        int outerXLeft  = startX + size / 10;           // x for left wheel
        int outerXRight = startX + 7 * size / 10;       // x for right wheel
        int outerY      = startY + size / 20;           // y for wheels
        int innerXLeft  = startX + 3 * size / 20;       // x for left hubcap
        int innerXRight = startX + 3 * size / 4;        // x for right hubcap
        int innerY      = startY + size / 10;           // y for hubcaps
        int windowX     = startX + 6 * size / 10;
        int windowY     = startY - 3 * size / 20;
        int windowWidth = 7 * size / 20;

        drawResizedBody(startX, startY);
        drawWheel(outerXLeft, outerY, innerXLeft, innerY, size / 5);
        drawWheel(outerXRight, outerY, innerXRight, innerY, size / 5);
        drawWindow(windowX, windowY, windowWidth, size / 6);
    }
}
