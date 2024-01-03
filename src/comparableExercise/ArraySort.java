package comparableExercise;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] numberArray = {2, 54, 23, 22, 2, 85, 36, 7, 95, 45, 33, 65, 12, 1, 35, 11, 55, 23, 32, 22};

        System.out.println("Unsorted:");
        System.out.println(Arrays.toString(numberArray));

        Arrays.sort(numberArray);
        System.out.println("sorted in ascending order");
        System.out.println(Arrays.toString(numberArray));

        Arrays.sort(numberArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {

                return -(n1.compareTo(n2));
            }
        });
        System.out.println("sorted in descending order:");
        System.out.println(Arrays.toString(numberArray));
    }
}
