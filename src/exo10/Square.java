package exo10;

public class Square extends Form {
    final double side;

    public Square(double side) {
        this.side = side;
    }

    public double diagonal() {
        return side * Math.sqrt(2);
    }

    @Override
    public String display() {
        return ("Carré, côté de " + side + "cm");
    }
}
