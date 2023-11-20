package polymorphism.hospital;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        /*
        Also correct, but we use shorter solution like under
        Doctor doctor = new Doctor("Sally","McQueen", 7500, 1300 );
        hospital.add(doctor);
        */


        hospital.add(new Doctor("Sally", "McQueen", 7500, 1300));
        hospital.add(new Nurse("Poppy","Pomfrey", 4000, 500));
        hospital.add(new Nurse("Rachele", "Ratched", 5500, 600));


    }
}
