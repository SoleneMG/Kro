package main.exo25.data.models;

public abstract class Person {
    public final String firstName;
    public final String lastName;
    public final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
