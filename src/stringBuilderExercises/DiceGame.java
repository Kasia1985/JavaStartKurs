package stringBuilderExercises;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("press enter to roll the dice");
        input.nextLine();
        String diceSide = Dice.roll();
        System.out.println(diceSide);
    }
}

