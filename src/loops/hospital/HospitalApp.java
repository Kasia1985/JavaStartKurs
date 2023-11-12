package loops.hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int add = 1;
        final int info = 2;
        int option = -1;
        Scanner input = new Scanner(System.in);

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println(exit + " - to exit program");
            System.out.println(add + " - add new patient");
            System.out.println(info + " - show all patients");


            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case add:
                    Patient patient = new Patient();
                    System.out.println("First name:");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Last name:");
                    patient.setSecondName(input.nextLine());
                    System.out.println("Pesel:");
                    patient.setPesel(input.nextLine());
                    hospital.addPatientToQueue(patient);
                    break;
                case info:
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Closing program");
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
        input.close();

    }
}
