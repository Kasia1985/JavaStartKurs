package abstractExercises.employeeSalary;

abstract class Employee {
    public static final int MONTHS = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    abstract double getMonthlySalary();

    abstract double getYearlySalary();

    @Override
    public String toString() {
        return firstName + " " + lastName
                + ", monthly salary: " + getMonthlySalary()
                + ", yearly salary: " + getYearlySalary();
    }
}
