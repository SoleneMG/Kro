package main.exo3;

public abstract class AbstractPerson {
    private final String name;

    AbstractPerson(String name) {
        this.name = name;
    }

    abstract protected int getCount();

    public final void display() {
        System.out.println("Coucou je suis l'affichage " + name + " n° " + getCount());
    }
}
