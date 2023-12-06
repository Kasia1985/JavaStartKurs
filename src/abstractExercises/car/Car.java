package abstractExercises.car;

import abstractExercises.car.Vehicle;

public class Car extends Vehicle {

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 5);
    }
}

