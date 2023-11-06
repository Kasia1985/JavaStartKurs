package javaBeans.app;

import javaBeans.controller.PointController;
import javaBeans.data.Point;

import java.sql.SQLOutput;

public class PointApplication {
    public static void main(String[] args) {

        PointController pc = new PointController();
        Point p1 = new Point(10, 20);

        final int add_x =0;
        final int add_y = 1;
        final int minus_x = 2;
        final int minus_y = 3;

        int option = add_x ;
        switch (option) {
            case add_x:
                pc.addX(p1);
                break;
            case add_y:
                pc.addY(p1);
                break;
            case minus_x:
                pc.minusX(p1);
                break;
            case minus_y:
                pc.minusY(p1);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + p1);
        }

        System.out.println("Point after change : (" + p1.getX() + "," + p1.getY() + ")");

        /*
        System.out.println("Punkt: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addX(p1);
        System.out.println("Punkt addX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addY(p1);
        System.out.println("Punkt addY: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusX(p1);
        System.out.println("Punkt minusX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusY(p1);
        System.out.println("Punkt minusY: (" + p1.getX() + ";" + p1.getY() + ")");
        */


    }
}
