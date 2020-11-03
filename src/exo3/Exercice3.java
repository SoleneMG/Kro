package exo3;

/*
1- juste le droit de créer des variables et modifier l'interieur des méthodes constructeur de Exercice3 (pas les signatures)
2- dans main appeler 3 fois afficher pour donner ça:
"Coucou je suis l'affichage Beurk n°1"
"Coucou je suis l'affichage Ploup n°2"
"Coucou je suis l'affichage Bibou n°3"

 */

public final class Exercice3 extends Exercice3Parent{
    public Exercice3(String monPetitNom) {
        super(monPetitNom);
    }

    protected int getCompteur() {
        return 0;
    }
}

abstract class Exercice3Parent {
    private final String monPetitNom;

    Exercice3Parent(String monPetitNom){
        this.monPetitNom = monPetitNom;
    }

    abstract protected int getCompteur();

    public final void afficher(){
        System.out.println("Coucou je suis l'affichage "+monPetitNom+" n° "+getCompteur());
    }
}