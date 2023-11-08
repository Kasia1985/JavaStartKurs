package arrayLift;

public class Elevator {

    private Person[] persons = new Person[4];
    private final int maxWeight = 400;
    private int peopleNumber = 0;


    void add(Person person) {
        if (peopleNumber < persons.length) {
            persons[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("There is no place in Elevator, please wait");
        }
    }

    void start() {
        if (weightIsCorrect()) {
            System.out.println("The elevator started moving");

        } else {
            int overload = getTotalWeight() - maxWeight;
            System.out.println("Max Weight above the limit about " + overload + "kg");
        }

    }

    private boolean weightIsCorrect() {
        return getTotalWeight() <= maxWeight;
    }

    private int getTotalWeight() {
        int totalWeight = 0;
        if (persons[0] != null) {
            totalWeight += persons[0].getWeight();
        }
        if (persons[1] != null) {
            totalWeight += persons[1].getWeight();
        }
        if (persons[2] != null) {
            totalWeight += persons[2].getWeight();
        }
        if (persons[3] != null) {
            totalWeight += persons[3].getWeight();
        }
        return totalWeight;

    }

    void clear() {
        persons = new Person[4];
 //     upper solution is the same but better than following solution:
//        persons[0] = null;
//        persons[0] = null;
//        persons[0] = null;
//        persons[0] = null;
        peopleNumber = 0;
    }
}
