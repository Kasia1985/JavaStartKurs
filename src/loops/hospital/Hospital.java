package loops.hospital;

import java.util.Scanner;

public class Hospital {

    private final int maxPatientsNumber = 10;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int currentPatientsNumber = 0;

    // Method to add a patient to the hospital queue
    public void addPatientToQueue(Patient patient) {
        if (currentPatientsNumber < maxPatientsNumber) {
            patients[maxPatientsNumber] = patient;
            currentPatientsNumber++;
        } else {
            System.out.println("Maximal numbers of patients on the list");
        }
    }

    // Method to print the details of patients in the queue
    public void printPatients() {
        for (int i = 0; i < currentPatientsNumber; i++) {
            System.out.println(patients[i].getFirstName() + " "
                    + patients[i].getSecondName() + " "
                    + patients[i].getPesel());
        }
    }
}