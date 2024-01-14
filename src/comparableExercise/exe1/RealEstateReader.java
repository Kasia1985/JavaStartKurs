package comparableExercise.exe1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealEstateReader {
    public static final int REALESTATE_IN_FILE = 10;

    static RealEstate[] readFile(String fileName) throws FileNotFoundException {
        RealEstate[] re = new RealEstate[REALESTATE_IN_FILE];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine(); //pomijamy nagłówek
            for (int i = 0; i < REALESTATE_IN_FILE; i++) {
                re[i] =  createRealEstateFromCsv(scanner.nextLine());
            }
        }
        return re;
    }

    private static RealEstate createRealEstateFromCsv(String csvLine) {
        String[] data = csvLine.split(";");
        return new RealEstate(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));
    }
}
