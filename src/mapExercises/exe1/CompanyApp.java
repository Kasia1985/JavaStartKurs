package mapExercises.exe1;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CompanyApp {
    private static final int ADD_EMPLOYEE = 0;
    private static final int FIND_EMPLOYEE = 1;
    private static final int EXIT = 2;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company();
        int userOption;

        do {
            printOptions();
            System.out.println("Choose option:");
            userOption = sc.nextInt();
            sc.nextLine();
            switch (userOption) {
                case ADD_EMPLOYEE:
                    Employee employee = readAndCreateEmployee();
                    company.addEmployee(employee);
                    break;
                case FIND_EMPLOYEE:
                    findEmployee(company);
                    break;
                case EXIT:
                    sc.close();
                    System.out.println("bye bye!");
            }
        } while (userOption != EXIT);
    }


    private static void findEmployee(Company company) {
        System.out.println("Give a first name:");
        String firstName = sc.nextLine();
        System.out.println("Give a last name:");
        String lastName = sc.nextLine();
        Employee employee = company.getEmployee(firstName, lastName);
        if (employee == null)
            System.out.println("employee not found");
        else
            System.out.println(employee);
    }

    private static Employee readAndCreateEmployee() {
        System.out.println("Give a first name:");
        String firstName = sc.nextLine();
        System.out.println("Give a last name:");
        String lastName = sc.nextLine();
        System.out.println("Give a salary:");
        double salary = sc.nextDouble();
        sc.nextLine();

        return new Employee(firstName, lastName, salary);
    }

    private static void printOptions() {
        System.out.println("If you want: ");
        System.out.println(" < add employee -> " + ADD_EMPLOYEE);
        System.out.println(" < find employee -> " + FIND_EMPLOYEE);
        System.out.println(" < exit -> " + EXIT);
    }
}
