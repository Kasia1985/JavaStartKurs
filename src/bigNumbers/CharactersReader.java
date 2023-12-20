package bigNumbers;

import java.util.Scanner;

public class CharactersReader {
    public static void main(String[] args) {
        String word = readWordFromUser();
        int digits = countDigits(word);
        System.out.println("Number of digits in the text: " + digits);
        int letters = countLetters(word);
        System.out.println("Number of letters in the text: " + letters);
        try {
            int biggestDigitInText = findBiggestDigit(word);
        } catch (DigitNotFoundException e) {
            System.out.println("There were no numbers in the text");
        }
    }


    private static String readWordFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text with letters and numbers");
        return sc.nextLine();
    }

    private static int countDigits(String word) {
        char[] chars = word.toCharArray();
        int digits = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar))
                digits++;
        }
        return digits;
    }

    private static int countLetters(String word) {
        char[] chars = word.toCharArray();
        int letters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar))
                letters++;
        }
        return letters;
    }

    private static int findBiggestDigit(String word) {
        char[] chars = word.toCharArray();
        final int notFound = -1;
        int biggestNumber = notFound;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                int digit = Character.getNumericValue(aChar);
                biggestNumber = Integer.max(biggestNumber, digit);
            }
        }
        if (biggestNumber == notFound)
            throw new DigitNotFoundException();
        return biggestNumber;
    }

    private static class DigitNotFoundException extends RuntimeException {
    }
}
