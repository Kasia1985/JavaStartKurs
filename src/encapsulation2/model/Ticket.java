package encapsulation2.model;

public class Ticket {
    private int ticketId;
    private Client client;
    private MovieShow movie;

    public Ticket(int ticketId, MovieShow movie,  Client client) {
        this.ticketId = ticketId;
        this.client = client;
        this.movie = movie;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public MovieShow getMovie() {
        return movie;
    }

    public void setMovie(MovieShow movie) {
        this.movie = movie;
    }

    public String getInfo(){
        return ticketId + " | " + movie.getMovieInfo() + " | " + client.getFullName();
    }


}
