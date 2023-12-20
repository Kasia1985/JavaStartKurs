package bigNumbers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {
    public static void main(String[] args) {
        String fileName = "bigNumbers.txt";

        try (
                var fr = new FileReader(fileName);
                var br = new BufferedReader(fr);
        ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger aBig = new BigInteger(br.readLine());
            BigInteger bBig = new BigInteger(br.readLine());
            System.out.println("a+b+c = " + (a + b + c));
            System.out.println("aBig+bBig = " + aBig.add(bBig));
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Data reading error");
        }
    }
}

