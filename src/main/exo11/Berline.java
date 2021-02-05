package main.exo11;

public class Berline extends Car {

    public Berline(String name) {
        super(name);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Précisément une berline, mon nom est " + name + ".");
    }
}
