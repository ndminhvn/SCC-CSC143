package exercise;

import java.awt.Color;

public interface Fillable {
    Color AQUA = new Color(0,150,225);
    void draw();
    void fill(Color color);
    void setLocation(int i, int y);
}
