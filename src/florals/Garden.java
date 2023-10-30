package florals;

public class Garden {
    public static void main(String[] args) {

        Plant plant1 = new Plant();

        plant1.name = "Rose";
        plant1.description = "beautiful flower";
        plant1.waterDemand = 0.2;
        double waterDemand = plant1.waterDemand;


        double weeklyWaterDemand = waterDemand * 7;

        double yearlyWaterDemand = waterDemand * 365;
        System.out.println(plant1.name + " needs " + weeklyWaterDemand + " liter water per week and " + yearlyWaterDemand + " liter per year");

    }
}
