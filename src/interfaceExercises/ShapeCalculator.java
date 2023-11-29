package interfaceExercises;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Provide information about the rectangle.");
        System.out.println("Enter the length of side A:");
        double a = sc.nextDouble();
        System.out.println("Enter the length of side B:");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Provide information about the circle.");
        System.out.println("Enter the length of radius:");
        double r = sc.nextDouble();

        return new Circle(r);
    }

    private Triangle readTriangleData() {
        System.out.println("Provide information about the triangle.");
        System.out.println("Enter the length of side A:");
        double a = sc.nextDouble();
        System.out.println("Enter the length of side B:");
        double b = sc.nextDouble();
        System.out.println("Enter the length of side C:");
        double c = sc.nextDouble();
        System.out.println("Enter height:");
        double h = sc.nextDouble();

        return new Triangle(a, b, c, h);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}
