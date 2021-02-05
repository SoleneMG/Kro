package main.exo9;

/**
 * Ecrire un krogramme qui demande combien il y a de personnes
 * pour chaque personne, demander le nom prénom age
 * afficher il y a X personnes de moins de 50 ans et X de plus de 50 ans
 * pour chaques personnes enregistrées, tu demandes en plus si ils ont un animal chat ou chien (avec nom). Ils ne peuvent avoir qu'un animal
 * le programme demande un nom de personne si cette personne est dans la liste il affiche son nom et son animal si i y en a un
 * cherche une personne et en modifie le nom (séparer la méthode de recherche et la méthode d'affichage)
 */
public class Exercise9 implements Runnable {
    @Override
    public void run() {
        MyScanner scanner = new MyScanner(System.in);
        Person[] board = registerPerson(scanner);
        displayPersonOver50years(board);
        Person person = requestPerson(board, scanner);
        displayPerson(person);
        person = requestPerson(board, scanner);
        Person newPerson = changeLastName(person, scanner);
        browseAndModifyValuesOfBoard(board, person, newPerson);
        displayNewNameOfPerson(newPerson);


        scanner.close();
    }

    public Person[] registerPerson(MyScanner scanner) {
        int number = scanner.returnInt("Combien y a-t-il de personnes?");
        Person[] board = new Person[number];

        for (int i = 0; i < number; i++) {
            Animal animal = null;

            int age = scanner.returnInt("Personne n°" + (i + 1) + ", veuillez indiquez votre âge :");
            String firstname = scanner.returnString("Veuillez indiquez votre prénom :");
            String lastname = scanner.returnString("Veuillez indiquez votre nom :");
            boolean haveAnAnimal = scanner.returnBoolean("Avez-vous un animal de compagnie ?");
            if (haveAnAnimal) {
                animal = registerAnimal(scanner);
            }
            board[i] = new Person(age, firstname, lastname, animal);
        }
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

    public Person requestPerson(Person[] board, MyScanner scanner) {
        String name = scanner.returnString("Quel nom cherchez-vous ?");
        for (Person person : board) {
            if (person.lastname.equalsIgnoreCase(name)) return person;
        }
        return null;
    }

    public void displayPerson(Person person) {
        if (person != null) {
            System.out.println("Le nom de la personne est " + person.lastname + ". ");
            if (person.animal != null) {
                System.out.println("Le nom de son animal est " + person.animal.name);
            }
        } else {
            System.out.println("Le nom recherché n'est pas dans la liste.");
        }
    }

    public Person changeLastName(Person person, MyScanner scanner) {
        boolean answer = scanner.returnBoolean("Souhaitez-vous changer le nom de famille de cette personne ?");
        if (answer) {
            String newName = scanner.returnString("Veuillez choisir le nouveau nom :");
            return person.cloneWithName(newName);
        }
        System.out.println("Le nom de la personne reste inchangé.");
        return person;
    }

    public void displayNewNameOfPerson(Person person) {
        System.out.println("le nom de la personne est " + person.lastname);
    }

    public void browseAndModifyValuesOfBoard(Person[] board, Person personToModify, Person newPerson) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == personToModify) {
                board[i] = newPerson;
                break;
            }
        }
    }
}

