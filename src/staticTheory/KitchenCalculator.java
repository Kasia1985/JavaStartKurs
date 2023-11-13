package staticTheory;

import java.util.Scanner;

public class KitchenCalculator {
    public static void main(String[] args) {
        final int cup = 0;
        final int spoon = 1;
        final int teaSpoon = 2;
        final int exit = 3;
        int option = -1;

        Scanner input = new Scanner(System.in);

        while (option != exit) {

            System.out.println("What would you like to convert?");
            System.out.println(cup + " - Cups");
            System.out.println(spoon + " - Spoons");
            System.out.println(teaSpoon + " - Tea spoons");
            System.out.println(exit + " - Exit program");

            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Give numbers of cups:");
                    double cups = input.nextDouble();
                    input.nextLine();
                    if(cups < 4){
                        System.out.println( KitchenUnits.convertCups(cups)+ " ml");
                    }else {
                        double l = KitchenUnits.convertCups(cups)/1000;
                        System.out.println(l + " l");
                    }
                    break;
                case 1:
                    System.out.println("Give numbers of spoons:");
                    double spoons = input.nextDouble();
                    input.nextLine();
                    System.out.println(KitchenUnits.convertSpoons(spoons) + " ml");
                    break;
                case 2:
                    System.out.println("Give numbers of tea spoons:");
                    double teaSpoons = input.nextDouble();
                    input.nextLine();
                    System.out.println(KitchenUnits.convertTeaSpoons(teaSpoons) + " ml");
                    break;
                case 3:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("Wrong command");

            }
        }
        input.close();
    }

    /* Alternative solution:
      double waterGlasses = 2;
        double oilSpoons = 2.5;
        double honeyTeaspoons = 4;

        double waterMl = KitchenUtils.glassesToMl(waterGlasses);
        double oilMl = KitchenUtils.spoonsToMl(oilSpoons);
        double honeyMl = KitchenUtils.teaspoonToMl(honeyTeaspoons);

        System.out.println("For the recipe you need:");
        System.out.println(waterGlasses + " glasses, that is " + waterMl + "ml of water");
        System.out.println(oilSpoons + " spoons, that is " + oilMl + "ml of oil");
        System.out.println(honeyTeaspoons + " tea spoons, that is " + honeyMl + "ml of honey");

     */
}
