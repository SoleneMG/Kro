package exo1;

/*
0 - ne pas toucher au constructeur de Exercice1
1 - créer dans Exercice1 une variable locale privée nom
2 - créer dans Exercice1 une variable statique prenom
3 - créer dans Exercice1 une méthode locale changerNom qui permet d'assigner une nouvelle valeur au nom
4 - créer dans Exercice1 une méthode statique afficherNomPrenom qui permet d'afficher les infos dans la console (nom - prenom)
5 - appeler afficherNomPrenom depuis main et faire en sorte que Solène Krognole s'affiche

 */
public class Exercise1 implements Runnable {
    private String lastName;
    static String firstName = "Solène";

    @Override
    public void run() {
        Exercise1 identity = new Exercise1();
        identity.setLastName("Solène");
        Exercise1.printFirstNameAndLastName("Krognole");
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void printFirstNameAndLastName(String setLastName) {
        System.out.println("Je m'appelle " + firstName + " " +setLastName);
    }
}

