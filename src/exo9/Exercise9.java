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
        MyScanner scanner = new MyScanner(System.in);

        int number = scanner.returnInt("Combien y a-t-il de personnes?");
        Person[] board = new Person[number];

        for (int i = 0; i < number; i++) {
            Animal animal = null;

            int age = scanner.returnInt("Personne n°" + ++i + ", veuillez indiquez votre âge :");
            String firstname = scanner.returnString("Veuillez indiquez votre prénom :");
            String lastname = scanner.returnString("Veuillez indiquez votre nom :");
            boolean haveAnAnimal = scanner.returnBoolean("Avez-vous un animal de compagnie ?");
            if (haveAnAnimal) {
                animal = registerAnimal(scanner);
            }
            --i;
            board[i] = new Person(age, firstname, lastname, animal);
        }
        scanner.close();
        return board;
    }

    public Animal registerAnimal(MyScanner scanner) {
        int choice = scanner.returnInt("Est-ce un chien ? (1), un chat ? (2), souhaitez-vous annuler ? (3)");
        switch (choice) {
            case 1:
                String nameOfTheDog = scanner.returnString("Quel est le nom de votre gentil toutou ?");
                return new Dog(nameOfTheDog);
            case 2:
                String nameOfTheCat = scanner.returnString("Quel est le nom de votre gentil chachat ?");
                return new Cat(nameOfTheCat);
            default:
                return null;
        }
    }

    public void displayPersonOver50years(Person[] board) {
        int numberOfPersonOver50years = 0;

        for (Person person : board) {

            if (person.age >= 50) {
                numberOfPersonOver50years++;
            }
        }
        System.out.println("Il y a " + numberOfPersonOver50years + " personnes de plus de 50 ans et " + (board.length - numberOfPersonOver50years) + " de moins de 50 ans.");
    }
}

