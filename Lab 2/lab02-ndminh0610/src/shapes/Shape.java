package shapes;

import java.util.Objects;

public abstract class Shape {
    private double x;
    private double y;

    public Shape() {
        this(0.0,0.0);
    }

    public Shape(double x, double y) {
        setLocation(x,y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Shape other = (Shape) obj;
            return Objects.equals(other.x, x)
                    && Objects.equals(other.y, y);
        } else
            return false;
    }

    public abstract double perimeter();

    public abstract double area();

    public void testShape() {
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Area: " + area());
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }

}
