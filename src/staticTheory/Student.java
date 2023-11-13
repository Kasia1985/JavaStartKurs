package staticTheory;

public class Student {
    private String firstName;
    private String lastName;
    private int index;
    private static int studentsNumber ;

    public Student(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        studentsNumber ++;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
