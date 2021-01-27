package exo23.domain;

import exo23.models.Child;

import java.io.*;
import java.util.List;

public class WriteInFile {

    public void children(String pathName, List<Child> childrenList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(pathName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(childrenList);
        fileOutputStream.close();
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
