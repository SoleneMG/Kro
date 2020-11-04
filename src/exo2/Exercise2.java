package exo2;

/*
1- Ne rien toucher dans le fichier Exerice2.java
2- Depuis main, afficher à la suite ces deux phrases avec la classe Exercice2
"Coucou je suis Solène Krognole, j'ai 31 ans et j'habite en France"
"Coucou je suis Rémy Choup, j'ai 30 ans et j'habite en Choupicardie"
 */
public class Exercise2 implements Runnable {
    @Override
    public void run() {
        Identity identitySolene = new Identity("Krognole");
        identitySolene.age = 31;
        identitySolene.setPrenom("Solène");
        Identity.pays = "Choupicardie";
        identitySolene.afficher();

        Identity identityRemy = new Identity("Choup");
        identityRemy.age = 30;
        identityRemy.setPrenom("Rémy");

        identityRemy.afficher();
    }
}

class Identity {
    private final String nom;
    private String prenom;
    public int age;
    public static String pays;

    public Identity(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void afficher() {
        System.out.println("Coucou, je suis " + nom + " " + prenom + ", j'ai " + age + " ans et j'habite en " + pays);
    }
}