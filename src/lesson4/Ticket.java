package lesson4;

public class Ticket {
    private Movie movie = null;
    private MovieSession movieSession = null;
    private int[] seats = {0, 0};
    private int price = 0;

    public Ticket(Movie movie, MovieSession movieSession, int[] seats, int price) {
        this.movie = movie;
        this.movieSession = movieSession;
        this.seats = seats;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieSession getMovieSession() {
        return movieSession;
    }

    public void setMovieSession(MovieSession movieSession) {
        this.movieSession = movieSession;
    }

    public int[] getSeats() {
        return seats;
    }

    public void setSeats(int[] seats) {
        this.seats = seats;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
