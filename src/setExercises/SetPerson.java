package setExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SetPerson {
    public static void main(String[] args) {
        final String file = "namespl.txt";

        TreeSet<String> persons = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        });

        try(Scanner sc = new Scanner(new File(file))){
            while(sc.hasNextLine()){
                persons.add(sc.nextLine());
            }
            System.out.println("Amounts of names in set: " + persons.size());
            System.out.println("First name: " + persons.first());
            System.out.println("Last name: " + persons.last());
        } catch (FileNotFoundException e) {
            System.err.println("There is no file name : " + file);
        }
    }
}
