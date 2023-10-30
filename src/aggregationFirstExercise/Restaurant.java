package aggregationFirstExercise;

public class Restaurant {
    public static void main(String[] args) {

        Client client1 = new Client();
        client1.name = "Kasia";
        client1.gender = "female";
        client1.nationality = "polish";
        client1.speakingLanguage = "polish";

        Client client2 = new Client();
        client2.name = "Sebastian";
        client2.gender = "male";
        client2.nationality = "polish";
        client2.speakingLanguage = "polish";

        Client client3 = new Client();
        client3.name = "Alejandro";
        client3.gender = "male";
        client3.nationality = "spanish";
        client3.speakingLanguage = "spanish";

        Menu menu1 = new Menu();
        menu1.dessert = "ice scream";
        menu1.dinner = "steak";
        menu1.drink = "coca cola";

        Menu menu2 = new Menu();
        menu2.breakfast = "scrambled eggs";
        menu2.dessert = "croissant";
        menu2.drink = "coffee";

        Menu menu3 = new Menu();
        menu3.lunch = "schnitzel";
        menu3.dessert = "cheesecake";
        menu3.drink = "bier";


        Order order1 = new Order();
        order1.client = client2;
        order1.menu = menu3;
        order1.priceToPay = 33;


        Order order2 = new Order();
        order2.client = client1;
        order2.menu = menu1;
        order2.priceToPay = 23;

        // created new menu for client 3 which wanted something different than was offered
        Order order3 = new Order();
        order3.client = client3;
        order3.menu = new Menu();
        order3.menu.breakfast = "toasts";
        order3.menu.drink = "black tee";


    }
}
