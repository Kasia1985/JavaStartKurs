package abstractExercises.employeeSalary;

public class PartTimeEmployee extends Employee {
    private int hours;
    private double ratePerHour;

    public PartTimeEmployee(String firstName, String lastName, int hours, double ratePerHour) {
        super(firstName, lastName);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    double getMonthlySalary() {
        double monthlyS = hours * ratePerHour;
        return monthlyS;
    }

    @Override
    double getYearlySalary() {
        double yearlyS = getMonthlySalary() * MONTHS;
        return yearlyS;
    }

}
