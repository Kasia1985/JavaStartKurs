package encapsulation;

public class DiscountApp {
    public static void main(String[] args) {

        Client client1 = new Client(null,"Brown",true);
        double price1 = 1100;
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price1);

        Client client2 = new Client(null,null, false);
        double price2 = 900;
        double discountPrice2 = discountService.calculateDiscountPrice(client1, price2);

        PrintService printService = new PrintService() ;
        printService.printSummary(client1, price1, discountPrice);
        printService.printSummary(client2, price2, discountPrice2);

    }
}
