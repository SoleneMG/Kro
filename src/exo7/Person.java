package exo7;

public class Person {
    private final String name;


    public Person(String name, Dog dog, Cat cat) {
        this.name = name;
    }
    public Person(String name, Dog dog) {
        this.name = name;
    }
    public Person(String name,Cat cat) {
        this.name = name;

    }
    public Person(String name) {
        this.name = name;
    }

    public void describeYourSelf() {

        System.out.print("Je m'appelle " + name + ".");


    }
}