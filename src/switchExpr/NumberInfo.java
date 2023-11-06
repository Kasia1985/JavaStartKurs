package switchExpr;

import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {


        Random random = new Random();
        int randomInt = random.nextInt(10000);  // 0-999

        System.out.println("The drawn randomInt is " + randomInt);

        NumberUtils numberUtils = new NumberUtils();
        numberUtils.compareNumberAndPrint(randomInt, 5000);
        numberUtils.printOddOrEven(randomInt);
        System.out.println("Number completed to four digits " + numberUtils.getFourDigitNumber(randomInt));

    }
}