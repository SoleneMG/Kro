package exo7;

public class Person {
    private final String name;
    final Dog dog;
    final Cat cat;

    public Person(String name, Dog dog, Cat cat) {
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }
    public Person(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
        this.cat = null;
    }

    public Person(String name, Cat cat) {
        this.name = name;
        this.dog = null;
        this.cat = cat;
    }
    public Person(String name) {
        this.name = name;
        this.dog = null;
        this.cat = null;

    }
    public void describeYourSelf() {

        System.out.println("Je m'appelle " + name + ".");
        if (this.dog != null) {
            System.out.println("Jai un chien qui s'appelle " + this.dog.getName());
        }
        if (this.cat != null){
            System.out.println("Jai un chat qui s'appelle "+this.cat.getName());
        }
    }
}