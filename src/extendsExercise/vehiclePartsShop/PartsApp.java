package extendsExercise.vehiclePartsShop;

public class PartsApp {
    public static void main(String[] args) {

        Tire tire = new Tire(123,"SuperTire", "ProContact", "WinterPro",
                17,123);

        Tire tire1 = new Tire(456, "Denlope", "Comfort", "efw", 123,34);

        tire.printInfo();
        tire1.printInfo();
    }
}
