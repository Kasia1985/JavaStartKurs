package constructorAndMethods;

public class HouseSystem {
    public static void main(String[] args) {
        House house1 = new House(10_000, 1000);

        System.out.println(house1.getStatus());
        System.out.println("we are having a bath");
        house1.takeBath();
        System.out.println(house1.getStatus());
        System.out.println("we watch TV through 4 hours");
        house1.watchTv(4);
        System.out.println(house1.getStatus());
        System.out.println("we boil water");
        house1.boilWater();
        System.out.println(house1.getStatus());

    }
}
