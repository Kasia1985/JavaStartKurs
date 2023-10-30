package methodsUnitsConversion;

public class ConversionSystem {

    public static void main(String[] args) {

        double m = 10;
        double cm = 23;
        double mm = 46;

        UnitConversion unitConversion = new UnitConversion();

        System.out.println(cm + "cm to " + unitConversion.cmToMetre(cm) + " m");
        System.out.println(m + "m to " + unitConversion.metreToCent(m) + " cm");
        System.out.println(m + "m to " + unitConversion.metreToMm(m) + " mm");
        System.out.println(mm + "mm to " + unitConversion.mmToMetre(mm) + " m");


        TimeConversion timeConversion = new TimeConversion();
        int hours = 14;
        int minutes = timeConversion.hToMin(hours);
        int seconds = timeConversion.minToSec(minutes);
        int millisec = timeConversion.secToMsec(seconds);

        System.out.println(hours + " hours it is " + millisec + " milliseconds");


        System.out.println();


    }
}
