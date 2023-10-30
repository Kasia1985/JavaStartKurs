package mathOperators;

import java.util.Random;

public class Operators {
    public static void main(String[] args) {

        Random rand = new Random();
        int number1 = rand.nextInt(100);
        int number2 = new Random().nextInt(100);

        System.out.println("x=" + number1 + "\ny=" + number2);

        boolean result = number1 > number2;
        System.out.println("x>y= " + result);

        result = number1 * 2 > number2;
        System.out.println("x*2>y = " + result);

        result = (number2 < number1 + 3) && (number2 > number1 + 2);
        System.out.println("(y<x+3)&&(y>x-2) = " + result);

        result = (number1 * number2) % 2 == 0;
        System.out.println("whether x * y is even? = " + result);

        /*
        int multiply = x*y;
        int modulo = multiply%2;
        boolean even = modulo == 0;
        System.out.println(even);
        */


    }
}
