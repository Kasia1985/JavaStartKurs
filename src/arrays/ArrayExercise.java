package arrays;

public class ArrayExercise {
    public static void main(String[] args) {

        int[] numbers1 = {4, 9, 8};
        int[] numbers2 = {1, 6, 3};

        int sum = numbers1[0] + numbers1[1] + numbers1[2] + numbers2[0] + numbers2[1] + numbers2[2];
        System.out.println("Simple summary: " + sum);

        ArrayUtils arrayUtils = new ArrayUtils();
        int arraySum = arrayUtils.ArraySum(numbers1, numbers2);
        System.out.println("Method summaring 2 arrays: " + arraySum);
    }
}