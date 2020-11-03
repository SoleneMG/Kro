package exo3;

/*
1- on peut juste modifier l'interieur du constructeur, de getCompteur, et créer des variables privées
(pas le droit d'écrire d'autres méthodes ou de modifier la méthode affichage)
2- dans main afficher
"Coucou je suis l'affichage Beurk n°1"
"Coucou je suis l'affichage Ploup n°2"
"Coucou je suis l'affichage Bibou n°3"

 */

public class Exercice3 {
    private final String monPetitNom;

    Exercice3(String monPetitNom){
        this.monPetitNom = monPetitNom;
    }

    private int getCompteur(){
        return 0; //modifier ici
    }

    public void afficher(){
        System.out.println("Coucou je suis l'affichage "+monPetitNom+" n° "+getCompteur());
    }
}
