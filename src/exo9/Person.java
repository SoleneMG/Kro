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

    int getAge() {
        return age;
    }

    String getFirstname() {
        return firstname;
    }

    String getLastname() {
        return lastname;
    }
}
