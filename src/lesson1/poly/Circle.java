package lesson1.poly;

public class Circle implements Shape {
    private final int r;
    private final float pi = 3.14f;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int getArea() {
        return (int) (pi * r * r);
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * pi * r);
    }

    @Override
    public int getCountOfPoints() {
        return 0;
    }
}
