package listExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    private static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);
    }

    //recursive method for loading data
    private static void fillList(List<Double> list) {
        System.out.println("Enter next number or give \" exit \":");

        String input = sc.nextLine();
        if (input.equals(SumNumbers.EXIT))
            return;

        try {
            Double num = Double.valueOf(input);
            list.add(num);
        } catch (NumberFormatException e) {
            System.err.println("Number in wrong format");
        }

        fillList(list);
    }

    private static void printData(List<Double> list) {
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (double d : list) {
                sb.append(d);
                sb.append('+');
                sum+=d;
            }
            sb.replace(sb.length() - 1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }
}