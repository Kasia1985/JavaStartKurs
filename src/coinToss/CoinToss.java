package coinToss;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {

    private Random input = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int userChoice;
    private int throwResult;

    private void showOptions() {
        System.out.println("Choose one of two options");
        System.out.println("1 - for heads");
        System.out.println("0 - for tails");
    }

    public void betResult() {
        showOptions();
        userChoice = scanner.nextInt();
    }

    void flipCoin() {
        throwResult = input.nextInt(2);
    }

    public void showResult() {
        if (userChoice == 1) {
            if (userChoice == throwResult) {
                System.out.println(throwResult + " - Well done, it's heads and you won!");
            } else {
                System.out.println(throwResult + " - Sorry it's tails so you've lost ;(");
            }
        } else if (userChoice == 0) {
            if (userChoice == throwResult) {
                System.out.println(throwResult + " - Well done, it's tails and you won!");
            } else {
                System.out.println(throwResult + " - Sorry it's heads so you've lost ;(");
            }
        }
    }
}
