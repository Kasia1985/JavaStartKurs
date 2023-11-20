package superExercise;

public class GroceryShop {
    public static void main(String[] args) {
        Apple apple = new Apple("Pink Lady", 180);
        Pear pear = new Pear("Williams" , 200);
        System.out.println(apple.getInfo());
        System.out.println(pear.getInfo());

    }
}
