package encapsulation2.system;

import encapsulation2.model.Client;
import encapsulation2.model.MovieShow;
import encapsulation2.model.Ticket;

public class CinemaSystem {

    public static void main(String[] args) {

        MovieShow movie1 = new MovieShow("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("John", "Brown", 15);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client client2 = new Client("Kate", "Williams", 20);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);

        Client client3 = new Client("Ana", "Smith", 50);
        Ticket ticket3 = ticketSystem.createTicket(movie1, client3);


        System.out.println("Sold tickets");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }
        if (ticket3 != null) {
            System.out.println(ticket3.getInfo());
        }

        System.out.println("Availlable seats " + movie1.getFreeSeats());
        System.out.println("Sold tickets: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }

}
