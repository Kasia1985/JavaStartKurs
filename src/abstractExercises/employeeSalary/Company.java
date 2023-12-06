package abstractExercises.employeeSalary;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = createEmployee();
        double totalMonthlySalary = totalMonthlySalary(employees);
        double totalYearlySalary = totalYearlySalary(employees);

        printEmployees(employees);
        System.out.println("Summary of monthly salary: " + totalMonthlySalary);
        System.out.println("Summary of yearly salary: " + totalYearlySalary);
    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("Employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static Employee[] createEmployee() {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("John", "Burton", 5000);
        employees[1] = new PartTimeEmployee("Ann", "Smith", 10, 80);
        return employees;
    }

    private static double totalMonthlySalary(Employee[] employees) {
        double totalMonthlySalary = 0;
        for (Employee employee : employees) {
            totalMonthlySalary += employee.getMonthlySalary();
        }
        return totalMonthlySalary;
    }

    private static double totalYearlySalary(Employee[] employees) {
        double totalYearlySalary = 0;
        for (Employee employee : employees) {
            totalYearlySalary += employee.getYearlySalary();
        }
        return totalYearlySalary;
    }
}
