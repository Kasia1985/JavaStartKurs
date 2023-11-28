package stringBuilderExercises;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        String[] words = getWords();

        String finalWord = createWordFromLastLetter(words);
        System.out.println("New word: " + finalWord);
    }

    private static String createWordFromLastLetter(String[] words) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            build.append(words[i].charAt(words[i].length() - 1));
        }
        String finalWord = build.toString();
        return finalWord;
    }

    private static String[] getWords() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many words would you like to input?");
        int wordNumbers = input.nextInt();
        input.nextLine();

        String[] words = new String[wordNumbers];

        System.out.println("Give words:");
        for (int i = 0; i < wordNumbers; i++) {
            words[i] = input.nextLine();
        }
        input.close();
        return words;
    }
}
