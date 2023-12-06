package abstractExercises.car;

import abstractExercises.car.Vehicle;
import abstractExercises.car.Car;

public class CarApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); //polimorfizm
        vehicle.speedUp();
        System.out.println("Car move with speed " + vehicle.getSpeed());
    }
}

