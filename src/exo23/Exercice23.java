package exo23;

import exo23.domain.ReadFile;
import exo23.domain.Register;
import exo23.domain.WriteInFile;
import exo23.models.Child;
import exo9.MyScanner;

import java.util.logging.*;

import java.util.List;

public class Exercice23 implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(Exercice23.class.getPackage().getName());
    /* gestionnaire de crèche
    voulez vous enregistrer ou voir la liste des enfants ?
    LISTE
    read dans un fichier txt un enfant par ligne afficher l'age de l'enfant et non sa date de naissance
    END nombre d'enfants
    ENREGISTRER
    ajouter un enfant avec nom prénom et date de naissance
    voulez-vous enregistrer un autre ? oui/non
    non -> END

    Fichier de LOGS qui ne renseigne que les 10 premières lignes
    Log à chaques étapes
     */
    @Override
    public void run() {
        MyScanner sc = new MyScanner(System.in);
        Register register = new Register();
        WriteInFile writeInFile = new WriteInFile();
        ReadFile readFile = new ReadFile();

        int whatDoYouDo = sc.returnInt("Que voulez-vous faire ? \n 1 - enregistrer un nouvel enfant \n 2 - consulter la liste des enfants enregistrés");
        if (whatDoYouDo == 1) {
            List<Child> childrenList = register.children(sc);
            if(readFile.returnChildrenList("./creche.txt") != null){
            childrenList.addAll(readFile.returnChildrenList("./creche.txt"));}
            writeInFile.children("./creche.txt", childrenList);
        } else {
            readFile.displayChildrenList(readFile.returnChildrenList("./creche.txt"));
        }
    }

}
