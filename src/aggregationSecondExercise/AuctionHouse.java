package aggregationSecondExercise;

public class AuctionHouse {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "John";
        person1.lastName = "kowalski";
        person1.address = new Address();
        person1.address.city = "Wroclaw";
        person1.address.street = "Kosciuszki";
        person1.address.homeNr = "24a";
        person1.address.flatNr = 21;
        person1.address.postalCode = "50-500";

        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalska";


        Auction auction1 = new Auction();
        auction1.title = "Xbox one";
        auction1.description = "A console for demanding gamers";
        auction1.price = 999.99;
        auction1.seller = person1;

        Auction auction2 = new Auction();
        auction2.title = "Samsung s200";
        auction2.description = "amazing phone with three lenses";
        auction2.price = 3999;
        auction2.seller = person2;

        System.out.println("Available auctions");
        System.out.println(auction1.title + ", " + auction1.description + ", " + auction1.price + " zl, " + auction1.seller.firstName + " " + auction1.seller.lastName);

        /* this is also ok
         Auction auction1 = new Auction();          //first you create auction
        auction1.title = "Xbox One";
        auction1.description = "A console for demanding gamers";
        auction1.price = 999.99;
        auction1.seller = new User();       //than directly user
        auction1.seller.firstName = "Jan";
        auction1.seller.lastName = "Kowalski";
        auction1.seller.address = new Address();            //and directly address to this user
        auction1.seller.address.city = "Wrocław";
        auction1.seller.address.postalCode = "50-500";
        auction1.seller.address.street = "Kościuszki";
        auction1.seller.address.homeNo = "24A";
        auction1.seller.address.flatNo = "21";

        Auction auction2 = new Auction();               //this user has no adress
        auction2.title = "Samsung S20";
        auction2.description = "amazing phone with three lenses";
        auction2.price = 3999;
        auction2.seller = new User();
        auction2.seller.firstName = "Justyna";
        auction2.seller.lastName = "Adamczyk";
         */
    }
}
