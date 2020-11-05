package exo7;

public class Person {
    private final String name;
    private int numberOfDog;
    private int numberOfCat;
    private static int numberOfPerson = 0;


    public Person(String name, int numberOfDog, int numberOfCat) {
        this.name = name;
        this.numberOfDog = numberOfDog;
        this.numberOfCat = numberOfCat;
        numberOfPerson++;
    }

    public void describeYourSelf() {
        if (numberOfPerson > 1) {
            System.out.println();
        }

        System.out.print("Je m'appelle " + name + ".");

        if (numberOfDog > 1) {
            System.out.print(" J'ai " + numberOfDog + " chiens,");
        } else if (numberOfDog == 1) {
            System.out.print(" J'ai " + numberOfDog + " chien,");
        } else System.out.print(" Je n'ai pas de chien,");

        if (numberOfCat > 1) {
            System.out.print(" j'ai " + numberOfCat + " chats.");
        } else if (numberOfCat == 1) {
            System.out.print(" j'ai " + numberOfCat + " chat.");
        } else System.out.print(" je n'ai pas de chat.");
    }
}