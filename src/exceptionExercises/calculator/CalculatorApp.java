package exceptionExercises.calculator;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;
        while (!readComplete) {
            try {
                System.out.println("Give a first number");
                a = input.nextDouble();
                input.nextLine();
                System.out.println("Enter the arithmetic operator: +, - , * , /");
                operator = input.nextLine();
                System.out.println("Give a second number");
                b = input.nextDouble();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong data, try again");
                input.nextLine();
            }
        }
        try {
            double result = Calculator.calculate(a, b, operator);
            System.out.println(a + operator + b + "=" + result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("the result of the expression could not be evaluated " + a + operator + b);
        }

    }

}

