package exo23;

import exo23.domain.Register;
import exo23.domain.WriteInFile;
import exo23.models.Child;
import exo9.MyScanner;

import java.io.IOException;
import java.util.List;

public class Exercice23 implements Runnable {
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


        List<Child> childrenList = register.children(sc);
        try {
            writeInFile.children("./creche.txt", childrenList);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
