package interfaceExercises;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                printOption();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("You entered data in the wrong format, please try again");
            } catch (NoSuchElementException e) {
                System.out.println("The selected shape ID is invalid, please try again");
            } finally {
                shapeCalc.clearBuffer();
            }
        }
        System.out.println(shape);
        shapeCalc.closeScanner();
    }

    private static void printOption() {
        System.out.println("Select the figure for which you want to calculate the area and perimeter");
        System.out.println(Shape.RECTANGLE + " - rectangle");
        System.out.println(Shape.CIRCLE + " - circle");
        System.out.println(Shape.TRIANGLE + " - triangle");
    }
}
