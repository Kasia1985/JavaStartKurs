package listExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = readNumbersFromUser();
        showStats(numbers);
    }

    private static List<Integer> readNumbersFromUser() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int next = 0;
        boolean numberIsCorrect = true;

        while (numberIsCorrect) {
            System.out.println("Enter another non-negative number divisible by 5");
            next = sc.nextInt();
            if (next >= 0 && next % 5 == 0) {
                numbers.add(next);
            } else {
                numberIsCorrect = false;
            }
        }
        return numbers;
    }

    private static void showStats(List<Integer> numbers) {
        int sum = sumNumbers(numbers);
        double avg = ((double) sum) / numbers.size();

        System.out.println("How many correct numbers:" + numbers.size());
        System.out.println("Their sum is:" + sum);
        System.out.println("while their sum is:" + sum);
    }

    private static int sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}

