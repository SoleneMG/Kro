package exo8;

/**
 * Créer une classe Baby qui a un nom
 * Faire une méthode dans Exercise8 qui permet de retourner un nom
 * Dans run créer un Baby et assigner la valeur du nom de la méthode au constructeur de Baby
 * Faire une méthode dans baby "displayName"
 * appeler cette méthode dans run
 *
 */
public class Exercise8 implements Runnable {
    @Override
    public void run() {

        Baby baby2 = new Baby();
        baby2.displayName();

    }
}
