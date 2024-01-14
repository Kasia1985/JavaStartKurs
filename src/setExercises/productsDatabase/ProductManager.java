package setExercises.productsDatabase;

import setExercises.productsDatabase.Product;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductManager {

    private static final int ADD_PRODUCT = 0;
    private static final int EXIT = 1;
    private static final int DISCARD_PRODUCT = 0;
    private static final int REPLACE_PRODUCT = 1;
    private Scanner sc = new Scanner(System.in);
    public Set<Product> products = new HashSet<>();

    void mainLoop() {
        int option;
        do {
            printOptions();
            option = readOption();
            evaluateOption(option);
        } while (option != EXIT);
    }

    private void printOptions() {
        System.out.println("Available option:");
        System.out.println(" > Add new product - " + ADD_PRODUCT);
        System.out.println(" > End program - " + EXIT);
    }

    private int readOption() {
        System.out.println("Choose option:");
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    private void evaluateOption(int option) {
        if (option == ADD_PRODUCT)
            addNextProduct();
        else if (option == EXIT)
            printProducts();
        else
            System.out.println("Unknown option");
    }

    private void printProducts() {
        System.out.println("All products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void addNextProduct() {
        Product product = createProduct();
        if (products.contains(product)) {
            askAndReplaceProduct(product);
        } else {
            addProduct(product);
        }
    }

    private Product createProduct() {
        System.out.println("Give product name:");
        String name = sc.nextLine();
        System.out.println("Give price:");
        double price = sc.nextDouble();
        return new Product(name, price);
    }

    private void askAndReplaceProduct(Product p) {
        System.out.println("Found product with same name, what would you like to do?");
        System.out.println(" > Ignore the product - " + DISCARD_PRODUCT);
        System.out.println(" > Override product  - " + REPLACE_PRODUCT);
        int option = readOption();
        if (option == REPLACE_PRODUCT) {
            products.remove(p);
            products.add(p);
        } else {
            System.out.println("In database stay previous product");
        }
    }

    private void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added to the Database");
    }
}

