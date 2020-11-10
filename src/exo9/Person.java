package exo9;

public class Person {
    final int age;
    final String firstname;
    final String lastname;

    Person(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    Person(int age, String firstname, String lastname, Dog dog) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    Person(int age, String firstname, String lastname, Cat cat) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
