package main.exo5;

public class Rectangle extends Form {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return length * width;
    }
}
