package mathOperators.scannerCalculator;

class Calculator {

    double calculate(double a, double b, String operator) {

        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
            break;
            case "-":
                result = a - b;
            break;
            case "*":
                result = a * b;
            break;
            case "/":
                result = a / b;
            break;
            default:
                System.out.println("Wrong command");

        }
        return result;
    }
}