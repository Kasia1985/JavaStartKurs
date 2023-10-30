package mathOperators;

import java.util.Random;

import static java.lang.Math.round;

public class vatCalculator {
    public static void main(String[] args) {

        Random rand = new Random();
        double priceNetto = rand.nextDouble(1000);
        priceNetto = round(priceNetto);
        double vat = 0.23;
        double priceBrutto = priceNetto + (priceNetto * vat);
        priceBrutto = round(priceBrutto);
        System.out.println("net price is: "+ priceNetto);
        System.out.println("VAT: "+ vat);
        System.out.println("to pay: "+ priceBrutto);

        //JavaStart solution: probably better because the net price is usually round without a decimal place
        //at least that's what it seems to me ;D

        double netto = 100;
        double vatT = 0.23;
        double vatAmount = netto * vatT;
        double brutto = netto + vatAmount;

        System.out.println("Cena netto: " + netto);
        System.out.println("Kwota VAT: " + vatAmount);
        System.out.println("Do zapłaty (brutto): " + brutto);

    }
}
