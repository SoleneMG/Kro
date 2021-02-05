package main.exo10;

public class Rectangle extends Form {
    final double width;
    final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double diagonal() {
        return Math.pow(width, 2.0) + Math.pow(length, 2.0);
    }

    @Override
    public String display() {
        return ("Rectangle, longueur de " + length + "cm, et largeur de " + width + "cm");
    }
}
