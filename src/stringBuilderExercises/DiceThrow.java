package stringBuilderExercises;

import java.util.Random;
import java.util.Scanner;


public class DiceThrow {
    public static void main(String[] args) {

        /*

        MY VERSION

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Throw a dice!");
        play();

    }

    public static void play () {
        Random rand = new Random();
        int number = rand.nextInt(6);
        String dice = null;
        switch (number + 1) {
            case 1:
                dice = """
                             - - - - -
                            |         |
                            |    0    |
                            |         |
                             - - - - - 
                            """;
                break;
            case 2:
                dice = """
                             - - - - -
                            |       0 |
                            |         |
                            | 0       |
                             - - - - - 
                            """;
                break;
            case 3:
                dice = """
                             - - - - -
                            |       0 |
                            |    0    |
                            | 0       |
                             - - - - - 
                            """;
                break;
            case 4:
                dice = """
                             - - - - -
                            | 0     0 |
                            |         |
                            | 0     0 |
                             - - - - - 
                            """;
                break;
            case 5:
                dice = """
                             - - - - -
                            | 0     0 |
                            |    0    |
                            | 0     0 |
                             - - - - - 
                            """;
                break;
            case 6:
                dice = """
                             - - - - -
                            | 0     0 |
                            | 0     0 |
                            | 0     0 |
                             - - - - - 
                            """;
                break;
        }
        System.out.println(dice);
    }
}