package exo10;

public class Circle extends Form {
    final double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    public double diameter() {
        return 2 * ray;
    }

    @Override
    public String display() {
        return ("Cercle, rayon de " + ray + "cm");
    }
}
