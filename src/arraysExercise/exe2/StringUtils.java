package arraysExercise.exe2;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtils {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();
        boolean compareLetters = compareLetters(s1, s2);
        if (compareLetters)
            System.out.println("The inscriptions consist of the same letters");
        else
            System.out.println("The inscriptions consist of different letters");
    }

    private static boolean compareLetters(String s1, String s2) {
        if (s1 == null && s2 == null)
            return true;
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        char[] string1ToLower = s1.toLowerCase().toCharArray();
        char[] string2ToLower = s2.toLowerCase().toCharArray();
        Arrays.sort(string1ToLower);
        Arrays.sort(string2ToLower);
        return Arrays.equals(string1ToLower, string2ToLower);
    }
}
