package arraysExercise.exe1;

public class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("John", "Burton", "1234567"));
        database.add(new Person("Kate", "Smith", "11223344"));
        database.add(new Person("Sebastian", "Mueler", "3333333"));
        database.add(new Person("Ann", "Anderson", "7367677"));
        database.add(new Person("Walter", "Wonka", "468746578"));
        database.add(new Person("Leo", "Holmes", "584876786"));

        Person person = database.get(1);
        System.out.println(person);
        System.out.println(database);
        database.remove(new Person("Ann", "Anderson", "7367677"));
        System.out.println();
        System.out.println(database);


    }

}
