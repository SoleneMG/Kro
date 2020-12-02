package exo18;

import exo18.models.Folder;

import java.util.ArrayList;
import java.util.List;

public class FolderGenerator {
    private int lastGenerationFoldersCount = 0;
    private int lastGenerationFilesCount = 0;

    public int getLastGenerationFoldersCount() {
        return lastGenerationFoldersCount;
    }

    public int getLastGenerationFilesCount() {
        return lastGenerationFilesCount;
    }

    public Folder generate(int maxSubFoldersCount) {
        List<Folder> folders = new ArrayList<>();

        if(maxSubFoldersCount > 0){
            int subFoldersCount = IntUtils.randomize(0, maxSubFoldersCount);

            for(int i = 0; i < subFoldersCount; i++){
                folders.add(generate(maxSubFoldersCount-1));
            }
        }

        lastGenerationFoldersCount++;
        return new Folder(generateFileList(), folders);
    }

    private List<String> generateFileList() {
        List<String> files = new ArrayList<>();
        int filesCount = IntUtils.randomize(0, 15);

        for(int i = 0; i < filesCount; i++){
            lastGenerationFilesCount++;
            files.add("Files n°"+i);
        }

        return files;
    }
}
