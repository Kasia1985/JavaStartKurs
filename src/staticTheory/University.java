package staticTheory;

public class University {
    public static void main(String[] args) {

        Student student2 = new Student("Anna", "Murphy", 8765432);
        Student student1 = new Student("John", "Snow", 1234567);

        System.out.println("Number of students after enrollment " + Student.getStudentsNumber());
    }
}


