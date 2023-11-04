package mathOperators;

import java.util.Random;

public class Dice {
    Random random = new Random();
    int number;

    Dice() {
        roll();
    }

    Dice(int number){
        this.number = number;
    }

    void roll(){
        number = random.nextInt(6) + 1;
    }

    void printInfo(){
        System.out.println("Liczba oczek na kostce: " + number);
    }
}
