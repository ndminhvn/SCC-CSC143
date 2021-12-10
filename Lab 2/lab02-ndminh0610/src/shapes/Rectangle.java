package shapes;

import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return Objects.equals(other.width, width)
                    && Objects.equals(other.height, height);
        } else {
            return false;
        }
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void testShape() {
        System.out.println("Rectangle ");
        System.out.println("Width: " + width() + "\tHeight: " + height());
        super.testShape();
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", width, height);
    }
}
