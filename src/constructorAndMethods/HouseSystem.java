package constructorAndMethods;

public class HouseSystem {
    public static void main(String[] args) {
        House house1 = new House(10_000, 1000);

        System.out.println(house1.getStatus());
        house1.takeShower();
        System.out.println(house1.getStatus());
        house1.watchTv(4);
        System.out.println(house1.getStatus());
        house1.boilWater();
        System.out.println(house1.getStatus());

    }
}
