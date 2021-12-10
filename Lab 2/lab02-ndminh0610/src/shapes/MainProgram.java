package shapes;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        //TODO: Create All Classes and Update with test methods
        ArrayList<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Circle(4));
        shapeList.add(new Rectangle(4,5));
        shapeList.add(new Triangle(5,12,13));
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());
        shapeList.add(new Triangle());

        System.out.println("\nTEST SHAPE PACKAGE");
        for (Shape shape : shapeList) {
            System.out.println();
            shape.testShape();
        }
    }
}
