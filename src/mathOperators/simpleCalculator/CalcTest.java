package mathOperators.simpleCalculator;

public class CalcTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        double a = 7;
        double b = 13;
        double c = 2;

        System.out.println("A: "+ a + "\nB: "+ b + "\nC: "+c);
        System.out.println("A+B: " + calc.add(a,b));
        System.out.println("A+B+C: " + calc.add(a,b,c));
        System.out.println("A-B: " +  calc.substract(a,b));
        System.out.println("A-B-C: " +  calc.substract(a,b,c));


    }
}
