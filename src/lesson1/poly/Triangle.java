package lesson1.poly;

public class Triangle implements Shape {
    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getArea() {
        float pp = ((float) getPerimeter()) / 2;
        return (int) Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getCountOfPoints() {
        return 3;
    }
}
