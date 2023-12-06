package abstractExercises.employeeSalary;

public class FullTimeEmployee extends Employee {
    private static final double YEARLY_BONUS = 0.05;
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    double getMonthlySalary() {
        return salary;
    }

    @Override
    double getYearlySalary() {
        double yearlyS = salary * MONTHS;
        double bonus = yearlyS * YEARLY_BONUS;
        return yearlyS + bonus;
    }

}
