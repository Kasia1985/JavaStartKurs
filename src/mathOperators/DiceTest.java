package mathOperators;

public class DiceTest {
    public static void main(String[] args) {
        Dice dice1 = new Dice(5);
        dice1.printInfo();
        dice1.roll();
        dice1.printInfo();
        dice1.roll();
        dice1.printInfo();
    }
}
