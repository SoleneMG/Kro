package exo9;

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
        MyScanner scanner = new MyScanner(System.in);

        number = scanner.returnInt("Combien y a-t-il de personnes?");
        Person[] board = new Person[number];

        for (i = 0; i < number; i++) {
            age = scanner.returnInt("Personne n°" + ++i + ", veuillez indiquez votre âge :");
            firstname = scanner.returnString("Veuillez indiquez votre prénom :");
            lastname = scanner.returnString("Veuillez indiquez votre nom :");
            --i;
            board[i] = new Person(age, firstname, lastname);
        }
        scanner.close();
        calculateAgeOfTheGroup(board, number);
    }

    public void calculateAgeOfTheGroup(Person[] board, int number) {
        int numberOfPersonOver50years = 0;

        for (Person person : board) {

            if (person.age >= 50) {
                numberOfPersonOver50years++;
            }
        }
        System.out.println("Il y a " + numberOfPersonOver50years + " personnes de plus de 50 ans et " + (number - numberOfPersonOver50years) + " de moins de 50 ans.");
    }
}
