package comparableExercise.realEstate;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class RealEstateApp {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            RealEstate[] realEstates = RealEstateReader.readFile("realestate.csv");
            Arrays.sort(realEstates);
            for (RealEstate realEstate : realEstates) {
                System.out.println(realEstate);
            }
        }catch(FileNotFoundException e){
            System.out.println("there is no file: realestate.csv");
        }
    }
}
