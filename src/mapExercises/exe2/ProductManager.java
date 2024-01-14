package mapExercises.exe2;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductManager {

    public static void main(String[] args) {
        try {
            Map<String, TreeSet<Product>> productsMap = ProductImporter.readFile("products.csv");
            String category = readCategoryFromUser();
            printCategoryStat(productsMap, category);
        } catch (FileNotFoundException e) {
            System.err.println("No file with products data");
        }
    }


    private static String readCategoryFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give category for displayed statistic:");
        return sc.nextLine();
    }

    private static void printCategoryStat(Map<String, TreeSet<Product>> productsMap, String category) {
        TreeSet<Product> products = productsMap.get(category);
        if (products == null) {
            System.out.println("no products from this category");
        } else {
            printAll(products);
            printAvgPrice(products);
            printCheapestAndExpensiveProduct(products);
        }
    }


    private static void printAvgPrice(Set<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice / products.size();
        System.out.printf("Average price %.2f%n", avgPrice);
    }

    private static void printAll(Set<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("The cheapest product " + products.first());

    }
}