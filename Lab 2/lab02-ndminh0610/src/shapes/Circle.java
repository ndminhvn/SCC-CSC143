package shapes;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public double radius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return Objects.equals(other.radius, this.radius);
        } else
            return false;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void testShape() {
        System.out.println("Circle ");
        System.out.println("Radius: " + radius());
        super.testShape();
    }

    @Override
    public String toString() {
        return String.format("(%.1f)", radius);
    }
}
