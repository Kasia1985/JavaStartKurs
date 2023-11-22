package enumExercises.onlineShop;

import java.util.Scanner;

public class ShopManager {
    public static void main(String[] args) {
        Order[] orders = createOrders();
        OrderStatus orderStatus = readStatus();
        Order[] filteredOrders = filterOrderByStatus(orders, orderStatus);
        printOrders(filteredOrders, orderStatus);

    }

    private static void printOrders(Order[] filteredOrders, OrderStatus orderStatus) {
        System.out.println("List of orders with status " + orderStatus + ":");
        for (Order order : filteredOrders) {
            System.out.println(order);
        }
    }

    private static Order[] createOrders() {
        Order[] orders = new Order[10];
        orders[0] = new Order("Laptop Apple MacBook Pro 2018", 2299, OrderStatus.PAID);
        orders[1] = new Order("Mobile phone Samsung Galaxy", 700, OrderStatus.DELIVERED);
        orders[2] = new Order("Mobile phone Apple iPhone 14Pro", 1250, OrderStatus.PAID);
        orders[3] = new Order("Washing machine Bosch X2000", 399, OrderStatus.DELIVERED);
        orders[4] = new Order("Fridge Siemens AT200", 899, OrderStatus.DELIVERED);
        orders[5] = new Order("Loudspeaker Bose W200", 299, OrderStatus.NEW);
        orders[6] = new Order("Home cinema Sony XLM500", 1349, OrderStatus.CANCELED);
        orders[7] = new Order("Console Sony Play Station 4", 1499, OrderStatus.SHIPPED);
        orders[8] = new Order("Switch USBC-HDMI", 35, OrderStatus.PAID);
        orders[9] = new Order("Iron Zelmer Primo", 25, OrderStatus.SHIPPED);
        return orders;
    }

    private static OrderStatus readStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give status of the orders to display (");
        for (OrderStatus o : OrderStatus.values()) {
            System.out.print(o.name() + " ");
        }
        System.out.println("):");
        String status = sc.nextLine().toUpperCase();
        return OrderStatus.valueOf(status);
    }


    private static Order[] filterOrderByStatus(Order[] orders, OrderStatus orderStatus) {
        int size = countOrderByStatus(orders, orderStatus);
        Order[] orderByStatus = new Order[size];
        int count = 0;
        for (Order order : orders) {
            if (order.getStatus() == orderStatus) {
                orderByStatus[count] = order;
                count++;
            }
        }
        return orderByStatus;
    }

    private static int countOrderByStatus(Order[] orders, OrderStatus orderStatus) {
        int count = 0;
        for (Order order : orders) {
            if (order.getStatus() == orderStatus)
                count++;
        }
        return count;
    }
}