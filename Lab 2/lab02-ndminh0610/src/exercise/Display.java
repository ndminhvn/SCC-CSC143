package exercise;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Display {

    public static final int WIDTH  = 500;
    public static final int HEIGHT = 400;
    public static final int X_TOP  = 200;
    public static final int Y_TOP  = 100;

    public JFrame frame;		//Display Window

    public Display() {
        this(WIDTH, HEIGHT);
    }

    public Display(int width, int height) {
        frame = new JFrame();
        frame.setTitle("Drawing Window");
        frame.setSize(width, height);
        frame.setLocation(X_TOP, Y_TOP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Graphics getGraphics() {
        return frame.getContentPane().getGraphics();
    }

    public void clear(){
        frame.repaint();
    }

    public void setBackground(Color c) {
        frame.getContentPane().setBackground(c);
    }

    public void pause(int milliseconds) throws Exception {
        Thread.sleep(milliseconds);
    }

}
