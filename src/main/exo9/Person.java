package main.exo9;

public class Person implements Cloneable {
    final int age;
    final String firstname;
    final String lastname;
    final Animal animal;

    Person(int age, String firstname, String lastname, Animal animal) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.animal = animal;
    }

    public Person cloneWithName(String name) {
        return new Person(age, firstname, name, animal);
    }
}
