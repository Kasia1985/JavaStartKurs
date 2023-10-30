package constructor;

public class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product prod, double pr, boolean spec) {
        product = prod;
        price = pr;
        special = spec;
    }

    void printInfo() {
        System.out.println(product.name + " company " + product.producer + " cost: " + price + "\nIs it a special offer? " + special);

    }
}
