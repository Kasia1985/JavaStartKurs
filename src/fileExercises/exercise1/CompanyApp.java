package fileExercises.exercise1;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    private static final String FILE_NAME = "employees.info";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entering employee data - " + READ_FROM_USER);
        System.out.println("Load and display data from a file - " + READ_FROM_FILE);

        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == READ_FROM_USER) {
            Company company = createCompany();
            writeFile(company);
        } else if (option == READ_FROM_FILE) {
            try {
                Company company = readFile();
                System.out.println(company);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Data reading error");
            }
        }
        scanner.close();
    }

    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var fis = new FileInputStream(FILE_NAME);
                var ois = new ObjectInputStream(fis);
        ) {
            return (Company) ois.readObject();
        }
    }

    private static void writeFile(Company company) {
        try (
                var fos = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(company);
            System.out.println("Data saved to file");
        } catch (IOException e) {
            System.err.println("File saving error");
        }
    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter salary:");
            double salary = scanner.nextInt();
            scanner.nextLine();
            company.add(new Employee(firstName, lastName, salary));
        }
        return company;
    }
}

