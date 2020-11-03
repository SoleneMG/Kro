import exo1.Exercice1;
import hello.HelloWorld;

public class Main {


    public static void main(String[] args) {
        HelloWorld HelloWorld = new HelloWorld("Rémy");
        HelloWorld.printHelloWorld();

        Exercice1 identity = new Exercice1();
        Exercice1.printFirstNameAndLastName("Krognole");
    }
}
