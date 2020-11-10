package exo9;

/**
 * Ecrire un krogramme qui demande combien il y a de personnes
 * pour chaque personne, demander le nom prénom age
 * afficher il y a X personnes de moins de 50 ans et X de plus de 50 ans
 * *pour chaques personnes enregistrées, tu demandes en plus si ils ont un animal chat ou chien (avec nom). Ils ne peuvent avoir qu'un animal
 */
public class Exercise9 implements Runnable {
    @Override
    public void run() {
        Person[] board = registerPerson();
        displayPersonOver50years(board);
    }

    public Person[] registerPerson() {
        int number;
        MyScanner scanner = new MyScanner(System.in);

        number = scanner.returnInt("Combien y a-t-il de personnes?");
        Person[] board = new Person[number];

        for (int i = 0; i < number; i++) {
            int age = scanner.returnInt("Personne n°" + ++i + ", veuillez indiquez votre âge :");
            String firstname = scanner.returnString("Veuillez indiquez votre prénom :");
            String lastname = scanner.returnString("Veuillez indiquez votre nom :");
            boolean haveAnAnimal = scanner.returnBoolean("Avez-vous un animal de compagnie ?");
            while (haveAnAnimal == true) {
                if (haveAnAnimal) {
                    int choice = scanner.returnInt("Est-ce un chien ? (1) ou un chat ? (2)");
                    switch (choice) {
                        case 1:
                            String nameOfTheDog = scanner.returnString("Quel est le nom de votre gentil toutou ?");
                            Dog dog = new Dog(nameOfTheDog);
                            haveAnAnimal = false;
                            break;
                        case 2:
                            String nameOfTheCat = scanner.returnString("Quel est le nom de votre gentil chachat ?");
                            Cat cat = new Cat(nameOfTheCat);
                            haveAnAnimal = false;
                            break;
                        default:
                            System.out.println("Vous avez fait une erreur de saisie, recommençons.");
                            haveAnAnimal = scanner.returnBoolean("Avez-vous un animal de compagnie ?");
                    }
                }
            }
            --i;
            board[i] = new Person(age, firstname, lastname);
        }
        scanner.close();
        return board;

    }

    public void displayPersonOver50years (Person[] board) {
        int numberOfPersonOver50years = 0;

        for (Person person : board) {

            if (person.age >= 50) {
                numberOfPersonOver50years++;
            }
        }
        System.out.println("Il y a " + numberOfPersonOver50years + " personnes de plus de 50 ans et " + (board.length - numberOfPersonOver50years) + " de moins de 50 ans.");
    }
}
