package staticTheory;

public class KitchenUnits {
    private static final double CUP_TO_ML = 250;
    private static final double SPOON_TO_ML = 15;
    private static final double TEA_SPOON_TO_ML = 5;
    private static double ml;


    public static double convertCups(double cups){
        return cups * CUP_TO_ML;
    }

    public static double convertSpoons(double spoons){
        return spoons * SPOON_TO_ML;
    }

    public static double convertTeaSpoons(double teaSpoons){
        return teaSpoons * TEA_SPOON_TO_ML;
    }

}
