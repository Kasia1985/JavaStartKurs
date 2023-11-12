package loops;

import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give current temp:");
        double currentTemp = sc.nextInt();
        sc.nextLine();
        System.out.println("Give target temperature:");
        int targetTemp = sc.nextInt();



            while(currentTemp != targetTemp){
                System.out.println("Current temperature: " + currentTemp);
                if (currentTemp<targetTemp) {
                    currentTemp += 0.5;
                } else if (currentTemp >targetTemp){
                    currentTemp -= 0.5;
                }
            }
            System.out.println("Reached target temperature: " + targetTemp);
    }
}