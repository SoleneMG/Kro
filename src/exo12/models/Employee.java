package exo12.models;

public abstract class Employee {
    final Factory factory;

    Employee(Factory factory) {
        this.factory = factory;

    }

    public void describeYourSelf() {
        System.out.print(", je travaille dans la Factory " + factory.name + " et ");
    }
}
