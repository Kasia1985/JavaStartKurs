package javaBeans.app;

import javaBeans.controller.PointController;
import javaBeans.data.Point;

public class PrintApplication {
    public static void main(String[] args) {

        PointController pc = new PointController();
        Point p1 = new Point(6,9);

        System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
        pc.addX(p1);
        System.out.println("Punkt addX: (" + p1.getX()+";"+p1.getY()+")");
        pc.addY(p1);
        System.out.println("Punkt addY: (" + p1.getX()+";"+p1.getY()+")");
        pc.minusX(p1);
        System.out.println("Punkt minusX: (" + p1.getX()+";"+p1.getY()+")");
        pc.minusY(p1);
        System.out.println("Punkt minusY: (" + p1.getX()+";"+p1.getY()+")");


    }
}
