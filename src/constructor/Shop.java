package constructor;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Milk chocolate", "Milka");

        Offer offer1 = new Offer(product1, 3.99, true);

        offer1.printInfo();
    }
}
