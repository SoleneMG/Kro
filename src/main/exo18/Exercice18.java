package main.exo18;

import main.exo18.models.Folder;

public class Exercice18 implements Runnable {
    @Override
    public void run() {
        FolderGenerator folderGenerator = new FolderGenerator();
        Folder parentFolder = folderGenerator.generate(5);

        System.out.println("Tu dois avoir " + folderGenerator.getLastGenerationFoldersCount() + " dossiers (incluant le parent) et " + folderGenerator.getLastGenerationFilesCount() + " fichiers, sinon tu peux krognoler");

        //calculer le nombre de dossiers du parentFolder (incluant le parent) avec une méthode récursive
        System.out.println(currentFolder(parentFolder)+1);
        System.out.println(countFiles(parentFolder));
    }

    public static int currentFolder(Folder parentFolder) {
        int countNumberOfFolder = 0;
        countNumberOfFolder+=parentFolder.subFolders.size();
        for (Folder folder : parentFolder.subFolders){
            countNumberOfFolder += currentFolder(folder);
        }
        return countNumberOfFolder;
    }

    public static int countFiles(Folder parentFolder){
        int countNumberOfFiles = 0;
        countNumberOfFiles+=parentFolder.files.size();
        for (Folder folder : parentFolder.subFolders){
            countNumberOfFiles += countFiles(folder);
        }
        return countNumberOfFiles;
    }


}
