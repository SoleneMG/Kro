package exo3;

/*
1- on ne peut modifier que "Person" en ajoutant des variables privées ou en modifiant l'interieur du constructeur ou getCount (pas la signature),
on ne peut pas créer d'autres méthodes
"Coucou je suis l'affichage Beurk n°1"
"Coucou je suis l'affichage Ploup n°2"
"Coucou je suis l'affichage Bibou n°3"

 */

public final class Exercise3 implements Runnable {
    @Override
    public void run() {
        //todo code here
        Person beurk = new Person("Beurk");
        beurk.display();
        Person ploup = new Person("Ploup");
        ploup.display();
        Person bibou = new Person("Bibou");
        bibou.display();
    }
}





