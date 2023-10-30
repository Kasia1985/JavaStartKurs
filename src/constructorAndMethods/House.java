package constructorAndMethods;

public class House {
    double water;
    double fuel;

    House(double w, double o) {
        water = w;
        fuel = o;
    }


    void takeShower() {
        water -= 48;
        System.out.println("we take a shower");
    }

    void takeBath() {
        water -= 86;
        System.out.println("we are having a bath");
    }

    void makeDinner() {
        water -= 0.1;
        fuel -= 4;
        System.out.println("we're making dinner");
    }

    void boilWater() {
        water -= 0.5;
        fuel -= 0.05;
        System.out.println("we boil water");
    }

    void watchTv(int hours) {
        double oilConsumption = hours * 0.06;
        fuel = fuel - oilConsumption;
        System.out.println("we watch TV through " + hours + " hours");
    }

    String getStatus() {
        return "ilosc wody: " + water + " litrow, ropa: " + fuel + " litrow";
    }
}
