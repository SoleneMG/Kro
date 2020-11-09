package exo8;

import java.util.Scanner;

/**
 * Créer une classe Baby qui a un nom
 * Faire une méthode dans Exercise8 qui permet de retourner un nom
 * Dans run créer un Baby et assigner la valeur du nom de la méthode au constructeur de Baby
 * Faire une méthode dans baby "displayName"
 * appeler cette méthode dans run
 */
public class Exercise8 implements Runnable {
    @Override
    public void run() {
        Baby baby2 = new Baby(returnName());
        baby2.displayName();
    }

    public String returnName() {
        String name;

        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom :");
        name = scan.nextLine();
        scan.close();
        return name;
    }
}
