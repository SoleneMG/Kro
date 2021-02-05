package main.exo18.models;

import java.util.List;

public class Folder {
    public final List<String> files;
    public final List<Folder> subFolders;

    public Folder(List<String> files, List<Folder> subFolders) {
        this.files = files;
        this.subFolders = subFolders;
    }
}
