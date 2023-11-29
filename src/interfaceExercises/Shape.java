package interfaceExercises;

public interface Shape {
    public static final double PI = 3.14;
    int RECTANGLE = 1;
    int TRIANGLE = 2;
    int CIRCLE = 3;

    // methods are default abstract and public
    double calculateArea();

    public double calculatePerimeter();


}
