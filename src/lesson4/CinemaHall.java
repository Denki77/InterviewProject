package lesson4;

public class CinemaHall {
    private final int capacity;
    private final String nameHall;

    public CinemaHall(int capacity, String nameHall) {
        this.capacity = capacity;
        this.nameHall = nameHall;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getNameHall() {
        return nameHall;
    }

    public String info() {
        return "CinemaHall " + nameHall + " (" + capacity + " seats). ";
    }

    @Override
    public String toString() {
        return "CinemaHall " + nameHall + ". ";
    }
}
