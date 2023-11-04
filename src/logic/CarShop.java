package logic;

import data.Car;

class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014, "audi", "a5", "black");
        Car audiA4 = new Car(2015, "audi", "a4");

        audiA4.setColor("red");

        System.out.println(audiA4.getBrand() + " " + audiA4.getModel() + " " + audiA4.getYear() + " " + audiA4.getColor());
        System.out.println(audiA5.getBrand() + " " + audiA5.getModel() + " " + audiA5.getYear() + " " + audiA5.getColor());
    }
}
