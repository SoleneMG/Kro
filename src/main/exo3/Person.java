package main.exo3;

public final class Person extends AbstractPerson {
    private static int numberOfCall = 0;

    public Person(String name) {
        super(name);
        numberOfCall++;
    }

    @Override
    protected int getCount() {
        return numberOfCall;
    }
}

