package lesson4;

import java.util.Date;

public class MovieSession {
    private Date date = null;
    private int max_duration_film = 0;
    private CinemaHall cinemaHall = null;

    public MovieSession(Date date, int max_duration_film, CinemaHall cinemaHall) {
        this.date = date;
        this.max_duration_film = max_duration_film;
        this.cinemaHall = cinemaHall;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMax_duration_film() {
        return max_duration_film;
    }

    public void setMax_duration_film(int max_duration_film) {
        this.max_duration_film = max_duration_film;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }
}
