package exo2;

/*
1- Ne rien toucher dans le fichier Exerice2.java
2- Depuis main, afficher à la suite ces deux phrases avec la classe Exercice2
"Coucou je suis Solène Krognole, j'ai 31 ans et j'habite en France"
"Coucou je suis Rémy Choup, j'ai 30 ans et j'habite en Choupicardie"
 */
public class Exercice2 {
    private final String nom;
    private String prenom;
    int age;
    static String pays;

    public Exercice2(String nom){
        this.nom = nom;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void afficher(){
        System.out.println("Coucou, je suis "+nom+" "+prenom+", j'ai "+age+" ans et j'habite en "+pays);
    }
}
