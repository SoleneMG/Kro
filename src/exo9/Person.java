package exo9;

public class Person {
    final int age;
    final String firstname;
    private String lastname;
    final Animal animal;

    Person(int age, String firstname, String lastname, Animal animal) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.animal = animal;
    }

    public String setLastname(String lastname) {
        this.lastname = lastname;
        return this.lastname;
    }

    public String getLastname(){
        return lastname;
    }
}
