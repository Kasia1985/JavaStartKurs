package exceptionExercises.calculator;

public class UnknownOperatorException extends RuntimeException{
    public UnknownOperatorException(String message) {
        super(message);
    }
}
