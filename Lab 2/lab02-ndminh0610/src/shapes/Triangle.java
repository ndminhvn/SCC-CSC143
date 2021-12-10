package shapes;

import java.util.Objects;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this(1,1,1);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle other = (Triangle) obj;
            return Objects.equals(other.a, a)
                    && Objects.equals(other.b, b)
                    && Objects.equals(other.c, c);
        } else
            return false;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void testShape() {
        System.out.println("Triangle ");
        System.out.println("Side a: " + getA() + "\tSide b: " + getB() + "\tSide c: " + getC());
        super.testShape();
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f)", a, b, c);
    }
}
