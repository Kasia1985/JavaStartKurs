package arrayLift;

public class ElevatorSimulator {
    public static void main(String[] args) {

        Person person1 = new Person(1, 60);
        Person person2 = new Person(2, 180);
        Person person3 = new Person(3,150);
        Person person4 = new Person(4,120);

        Elevator elevator = new Elevator();
        System.out.println();

        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person4);
        //lift.add(person5);

        elevator.start();
    }

}
