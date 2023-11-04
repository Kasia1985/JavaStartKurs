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
    }

    void takeBath() {
        water -= 86;
    }

    void makeDinner() {
        water -= 0.1;
        fuel -= 4;
    }

    void boilWater() {
        water -= 0.5;
        fuel -= 0.05;
    }

    void watchTv(int hours) {
        double oilConsumption = hours * 0.06;
        fuel = fuel - oilConsumption;
    }

    String getStatus() {
        return "ilosc wody: " + water + " litrow, ropa: " + fuel + " litrow";
    }
}
