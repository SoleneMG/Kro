package exo9;

import java.util.Scanner;

/**
 * Ecrire un krogramme qui demande combien il y a de personnes
 * pour chaque personne, demander le nom prénom age
 * afficher il y a X personnes de moins de 50 ans et X de plus de 50 ans
 */
public class Exercise9 implements Runnable {
    @Override
    public void run() {
        boardOfPerson();
    }

    public void boardOfPerson() {
        int i;
        int number;
        int age;
        String firstname;
        String lastname;
        Scanner sc = new Scanner(System.in);

        System.out.println("Combien y a-t-il de personnes ?");
        number = sc.nextInt();
        Person[] board = new Person[number];

        for (i=0; i < number; i++) {

            System.out.println("Personne n°" + ++i + " ,veuillez indiquer dans l'ordre votre âge, votre prénom et votre nom svp :");
            System.out.println("Votre âge :");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("Votre prénom :");
            firstname = sc.nextLine();
            System.out.println("Votre nom :");
            lastname = sc.nextLine();
            --i;
            board[i] = new Person(age, firstname, lastname);
        }
        sc.close();
        calculateAgeOfTheGroup(board);
    }

    public void calculateAgeOfTheGroup(Person[] board) {
        int numberOfPersonOver50years = 0;
        int numberOfPersonUnder50years = 0;

        for (Person person : board) {

            if (person.age >= 50) {
                numberOfPersonOver50years++;
            } else {
                numberOfPersonUnder50years++;
            }
        }
        System.out.println("Il y a " + numberOfPersonOver50years + " personnes de plus de 50 ans et " + numberOfPersonUnder50years + " de moins de 50 ans.");
    }
}
