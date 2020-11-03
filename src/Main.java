import exo2.Exercice2;

public class Main {


    public static void main(String[] args) {
       /* HelloWorld HelloWorld = new HelloWorld("Rémy");
        HelloWorld.printHelloWorld();

        Exercice1 identity = new Exercice1();
        Exercice1.printFirstNameAndLastName("Krognole");*/

        Exercice2 identitySolene = new Exercice2("Krognole");
        identitySolene.age = 31;
        identitySolene.setPrenom("Solène");
        Exercice2.pays = "Choupicardie";
        identitySolene.afficher();

        Exercice2 identityRemy = new Exercice2("Choup");
        identityRemy.age = 30;
        identityRemy.setPrenom("Rémy");

        identityRemy.afficher();


    }
}
