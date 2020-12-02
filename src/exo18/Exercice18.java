package exo18;

import exo18.models.Folder;

public class Exercice18 implements Runnable{
    @Override
    public void run() {
        FolderGenerator folderGenerator = new FolderGenerator();
        Folder parentFolder = folderGenerator.generate(5);

        System.out.println("Tu dois avoir "+folderGenerator.getLastGenerationFoldersCount()+" dossiers (incluant le parent) et "+folderGenerator.getLastGenerationFilesCount()+" fichiers, sinon tu peux krognoler");

        //calculer le nombre de dossiers du parentFolder (incluant le parent) avec une méthode récursive
    }
}
