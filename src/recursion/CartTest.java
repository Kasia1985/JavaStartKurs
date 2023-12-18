package recursion;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("Milk", 3.45));
        cart.addProduct(new Product("Bread", 4.3));
        cart.addProduct(new Product("Coca-cola", 0.95));

        double cartCost = cart.totalCost();
        System.out.println("Cart cost: "+ cartCost + " euro");

    }
}
