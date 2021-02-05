package main.exo23;

import main.exo23.domain.ReadFile;
import main.exo23.domain.Register;
import main.exo23.domain.WriteInFile;
import main.exo23.models.Child;
import main.exo9.MyScanner;

import java.util.List;
import java.util.logging.Logger;

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

        int whatDoYouDo = sc.returnInt("Que voulez-vous faire ? \n 1 - enregistrer un nouvel enfant \n 2 - consulter la liste des enfants enregistrés");
        if (whatDoYouDo == 1) {
            registerNewChild(sc);
        } else {
            lookListOfChildren();
        }
    }

    public void lookListOfChildren() {
        ReadFile readFile = new ReadFile();

        readFile.displayChildrenList(readFile.returnChildrenList("./creche.txt"));
    }

    public void registerNewChild(MyScanner sc) {
        Register register = new Register();
        WriteInFile writeInFile = new WriteInFile();
        ReadFile readFile = new ReadFile();

        List<Child> childrenList = register.children(sc);
        if (readFile.returnChildrenList("./creche.txt") != null) {
            childrenList.addAll(readFile.returnChildrenList("./creche.txt"));
        }
        writeInFile.children("./creche.txt", childrenList);
    }
}
