package exo7;

/**
 * Toutes les variables crées seront modifiables que depuis le constructeur de la classe concernée
 * Créer une classe Dog qui a un nom
 * Créer une classe Cat qui a un nom
 * Créer une classe Person qui a un nom et peut-être un chat ou un chien
 * Dans run, instancier une personne avec un chat
 */
public class Exercise7 implements Runnable {
    @Override
    public void run() {

        Cat cat = new Cat("Miaou");
        Person solene = new Person("Solène", cat);
        solene.describeYourSelf();

        Dog dog = new Dog("Ouaf");
        Person remy = new Person("Rémy", dog);
        remy.describeYourSelf();

        Person orianne = new Person("Orianne", dog, cat);
        orianne.describeYourSelf();

    }
}
