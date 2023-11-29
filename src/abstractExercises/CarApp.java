package abstractExercises;

public class CarApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); //polimorfizm
        vehicle.speedUp();
        System.out.println("Car move with speed " + vehicle.getSpeed());
    }
}

