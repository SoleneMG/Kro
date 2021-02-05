package main.exo11;

public class SUV extends Car {

    public SUV(String name) {
        super(name);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Précisement un SUV, mon nom est " + name + ".");
    }
}
