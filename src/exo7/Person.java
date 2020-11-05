package exo7;

public class Person {
    private final String name;
    String nameOfcat;
    String nameOfdog;


    public Person(String name, Dog dog, Cat cat) {
        this.name = name;
        nameOfdog = dog.getName();
        nameOfcat = cat.getName();
    }
    public Person(String name, Dog dog) {
        this.name = name;
        nameOfdog = dog.getName();
    }
    public Person(String name,Cat cat) {
        this.name = name;
        nameOfcat = cat.getName();
    }
    public Person(String name) {
        this.name = name;
    }

    public void describeYourSelf() {

        System.out.print("Je m'appelle " + name + "."+"\n");
        if (nameOfdog != null){
            System.out.print("Mon chien s'appelle "+nameOfdog+".");
        }
        if (nameOfcat != null){
            System.out.print("Mon chat s'appelle "+nameOfcat+".");
        }


    }
}