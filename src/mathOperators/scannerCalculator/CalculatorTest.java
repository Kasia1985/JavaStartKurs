package mathOperators.scannerCalculator;

import java.util.Scanner;
import java.util.concurrent.Callable;

class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert first number:");
        double firstNr = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Choose:( + , - , / , * )");

        String operator = scanner.nextLine();
        System.out.println("Please insert second number:");
        double secondNr = scanner.nextDouble();
        scanner.close();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(firstNr, secondNr,operator);
        System.out.println(firstNr + operator + secondNr + "=" + result);


    }
}
