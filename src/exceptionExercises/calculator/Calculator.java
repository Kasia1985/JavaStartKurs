package exceptionExercises.calculator;

public class Calculator  {
    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MULTI = "*";
    private static final String DIV = "/";

    public static double calculate(double a, double b, String command){
        double result;
        switch(command){
            case ADD:
                result = a+b;
                break;
            case SUB:
                result = a-b;
                break;
            case MULTI:
                result = a*b;
                break;
            case DIV:
                if(b == 0)
                    throw new ArithmeticException("You cant divide with 0");
                result = a/b;
                break;
            default:
                throw new UnknownOperatorException("Wrong operator");
        }
        return result;
    }
}
