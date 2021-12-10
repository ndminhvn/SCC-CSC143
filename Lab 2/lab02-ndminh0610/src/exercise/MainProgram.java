package exercise;

import java.awt.Color;
import java.awt.Graphics;

public class MainProgram {

    public static void testDrawable(Display display, Drawable circles) throws Exception {

        // TODO : Move to location and draw Yellow Circles
        circles.move(50,0);
        circles.draw(new Color(255,255,0));
        // TODO : Move to location and draw RED Circles
        circles.move(0,100);
        circles.draw(new Color(255,0,0));
        // TODO : Move to location and draw Circles with Fillable AQUA
        circles.move(0,100);
        circles.draw(Fillable.AQUA);
        display.pause(500);
    }

    public static void testFillable(Display display, Fillable filledCircles) throws Exception {

        //TODO: Set Location back to location (50, 50)
        filledCircles.setLocation(0,0);
        display.pause(500);

        // TODO : Draw fillable  RED, WHITE and BLUE Circles
        filledCircles.fill(new Color(255,0,0));
        filledCircles.fill(new Color(255,255,255));
        filledCircles.fill(new Color(0,0,255));
        filledCircles.draw();
        // TODO : Draw circles with Fillable AQUA Color
        display.pause(500);
    }

    public static void main(String[] args) throws Exception{

        Display display = new Display(600, 500);
        display.setBackground(Color.DARK_GRAY);

        // Get Graphics Pen Object for Drawing in Window
        Graphics pen = display.getGraphics();

        // TODO : Create Circles of a Drawable Type
        Drawable drewCircles = new Circles(pen);

        // TODO : Draw Drawable  Circles
        testDrawable(display,drewCircles);

        // clear display if needed (uncomment)
        display.clear();

        // TODO : Create Circles of a Fillable Type
        Fillable filledCircles = new Circles(pen);

        // TODO : Draw Fillable Circles
        testFillable(display,filledCircles);
    }
}
