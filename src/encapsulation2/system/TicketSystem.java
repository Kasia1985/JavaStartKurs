package encapsulation2.system;

import encapsulation2.model.Client;
import encapsulation2.model.MovieShow;
import encapsulation2.model.Ticket;


public class TicketSystem {

    Ticket createTicket(MovieShow movieShow, Client client) {
        if (!movieShow.hasFreeSeats()) {
            System.out.println("Sold out");
            return null;
        } else if (!clientHasRequiredAgeForMovie(client, movieShow)) {
            System.out.println("Movie is available for viewers above " + movieShow.getAgeRequired() + " years old");
            return null;
        } else {
            int ticketId = generateNextTicketId(movieShow);
            movieShow.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, movieShow, client);
        }
    }
    private int generateNextTicketId(MovieShow movieShow){
        return movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
    }

    private boolean clientHasRequiredAgeForMovie(Client client, MovieShow movieShow){
        return client.getAge() >= movieShow.getAgeRequired();
    }
}