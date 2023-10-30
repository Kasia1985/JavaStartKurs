package mathOperators;

public class MathOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 4;  //change it to double because now the result of division will be 2 and it should be 2.5

        int sum = x + y;
        int sub = x - y;
        int multi = x * y;
        double div = x / y;
        int mod = x % y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);
    }
}
