package stringBuilderExercises;

import java.util.Scanner;

public class TextPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any text");
        String inputText = input.nextLine();
        char firstCharacter = inputText.charAt(0);
        if (Character.isUpperCase(firstCharacter)) {
            inputText = inputText.toUpperCase();
        } else if (Character.isLowerCase(firstCharacter)) {
            inputText = inputText.toLowerCase();
        }
        System.out.println(inputText);
    }
}

