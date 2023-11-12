package loops;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many number would you like to read?");
        int amount = sc.nextInt();
        int sum = 0;
        System.out.println("Give " + amount + " numbers");
        for (int i = 0; i < amount; i++) {
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("the Summary of these numbers = " + sum);
        sc.close();

        //Another solution just with two variables:
//        int sum = 0;
//        while (numbers-- > 0) {
//             System.out.println("Podaj kolejną liczbę: ");
//             sum = sum + sc.nextInt();
//            }

        }
    }
