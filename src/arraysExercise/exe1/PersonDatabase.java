package arraysExercise.exe1;

import arraysExercise.exe1.Person;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] persons = new Person[INITIAL_CAPACITY];
    private int emptyPlace;

    void add(Person person) {
        if(person == null)
            throw new NullPointerException("person cannot be null");
        if(emptyPlace == persons.length){
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
        persons[emptyPlace] = person;
        emptyPlace++;
    }

    void remove(Person person){
        if(person == null)
            throw new NullPointerException("person cannot be null");
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < emptyPlace && foundIndex ==notFound; i++) {
            if(person.equals(persons[i])){
                foundIndex = i;
            }
        }
        if(foundIndex != notFound){
            System.arraycopy(persons,foundIndex+1, persons, foundIndex, persons.length-foundIndex-1);
            emptyPlace--;
            persons[emptyPlace] = null;
        }
    }

    Person get(int index){
        if(index >= emptyPlace || emptyPlace < 0 )
            throw new ArrayIndexOutOfBoundsException("Index has to be positive and lower than " + emptyPlace);
        return persons[index];
    }

    int size(){
        return  emptyPlace;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonDatabase size: " + emptyPlace);
        sb.append("\n");
        for (int i = 0; i < emptyPlace; i++) {
            sb.append(" > ");
            sb.append(persons[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
