package lesson4;

public class Movie {
    private String nameMovie = null;
    private int durationOfMovie = 0;

    public Movie(String nameMovie, int durationOfMovie) {
        this.nameMovie = nameMovie;
        this.durationOfMovie = durationOfMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public int getDurationOfMovie() {
        return durationOfMovie;
    }

    public void setDurationOfMovie(int durationOfMovie) {
        this.durationOfMovie = durationOfMovie;
    }
}
