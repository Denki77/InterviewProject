package lesson1;

interface Moveable {
    void move();
}

interface Stopable {
    void stop();
}

class Engine {
} // add class Engine

abstract class Car {
    private Engine engine; // public -> private
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class LightWeightCar extends Car implements Moveable {

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

}

class Lorry extends Car implements Moveable, Stopable { // , ->  implements

    public void move() {
        System.out.println("Car Lorry is moving");
    }

    public void stop() {
        System.out.println("Car Lorry is stop");
    }

    @Override
    void open() { // add override open() from Car
        System.out.println("Lorry is open");
    }
}
