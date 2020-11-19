package exo11;

public abstract class Car {
    final String name;

    public Car(String name) {
        this.name = name;
    }

    public void display() {
        System.out.print("Je suis une voiture. ");
    }
}
