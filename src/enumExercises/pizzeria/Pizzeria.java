package enumExercises.pizzeria;

import enumExercises.pizzeria.Pizza;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        printPizzas();
        Pizza pizza = getPizza();
        System.out.println("You choose " + pizza.name() + "\nThank you for your order!");

    }

    private static Pizza getPizza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which pizza would you like to order:");
//        String order = sc.nextLine();
//        Pizza.valueOf(order);

        Pizza pizza = Pizza.valueOf(sc.nextLine().toUpperCase());
        sc.close();
        return pizza;
    }

    private static void printPizzas() {
        System.out.println("Pizzas: ");
        Pizza[] pizzas = Pizza.values();
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
