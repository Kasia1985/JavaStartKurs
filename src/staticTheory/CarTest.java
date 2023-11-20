package staticTheory;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(0,true,false,false,true);
        car.start();
        System.out.println(car.status());
        System.out.println();




    }
}
