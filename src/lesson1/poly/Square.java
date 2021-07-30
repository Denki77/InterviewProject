package lesson1.poly;

public class Square implements Shape {
    private final int a;
    private final int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return a * b;
    }

    @Override
    public int getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public int getCountOfPoints() {
        return 4;
    }
}
