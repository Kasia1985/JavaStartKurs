package classesAndObjects;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.firstName = "Sebastan";
        employee1.secondName = "Kowalski";
        employee1.birthYear = 1985;
        employee1.street = "Dalbraut";
        employee1.houseNr = 9;
        employee1.seniority = 8;

        employee2.firstName = "Joanna";
        employee2.secondName = "Krupa";

        employee3.firstName = "Blazej";
        employee3.secondName = "Wieczorek";


        System.out.println("Our new employee name is " + employee1.firstName + " " + employee1.secondName);
        System.out.println("Hi and there are two more: " + employee2.firstName + " " + employee2.secondName + " and " + employee3.firstName + " " + employee3.secondName);
    }
}
