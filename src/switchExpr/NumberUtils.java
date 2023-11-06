package switchExpr;

public class NumberUtils {

    void compareNumberAndPrint(int number, int compareTo) {
        if (number < compareTo)
            System.out.println(number + " is smaller than " + compareTo);
        else if (number == compareTo)
            System.out.println(number + " is " + compareTo);
        else if (number > compareTo)
            System.out.println(number + " is bigger than " + compareTo);
    }


    void printOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    // 1234 / 1000 = 1
    // 123 / 1000 = 0
    // 123 / 100 = 1
    // 12 / 10 = 1


    int getFourDigitNumber(int number){
            if(number/ 1000!=0)
                return number;
             else if (number /100 != 0)
                return number * 10;
            else if (number / 10 !=0 )
                return number * 100;
             else
                return number * 1000;

    }
}


