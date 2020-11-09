package exo6;

/**
 * Créer une classe Person avec les variables suivantes, voir si elles sont statiques ou pas:
 * name
 * numberMaxOfEyes
 * eyesColor
 * numberMaxOfFingers
 * size
 * firstname
 * language
 * skinColor
 */
public class Exercise6 implements Runnable {
    @Override
    public void run() {
        Person solene = new Person("Krognole", "marrons", 1.72, "Solène", "français", "blanche");
        solene.describeYourSelf();
    }
}
