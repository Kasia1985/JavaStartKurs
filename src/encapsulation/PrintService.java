package encapsulation;

class PrintService {

    public void printSummary(Client client, double originalPrice, double discountPrice) {
        printWelcomeMessage(client);
        printPrices(originalPrice, discountPrice);
    }

    private void printPrices(double originalPrice, double discountPrice) {
        System.out.println("Price before discount: " + originalPrice);
        System.out.println("Price to pay (after discount): " + discountPrice);
    }

    private void printWelcomeMessage(Client client) {
        if (client.getLastName() == null && client.getFirstName() != null) {
            System.out.println("Hello " + client.getFirstName());
        } else if (client.getFirstName() == null && client.getLastName() != null) {
            System.out.println("Welcome Mrs/Mr " + client.getLastName());
        } else if (client.getFirstName() != null && client.getLastName() != null) {
            System.out.println("Welcome " + client.getFirstName() + " " + client.getLastName());
        } else {
            System.out.println("Hello stranger");
        }
    }
}
