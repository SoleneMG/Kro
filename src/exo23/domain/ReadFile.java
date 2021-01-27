package exo23.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {

    public void read(String pathName) throws FileNotFoundException,IOException {
        FileInputStream fileInputStream = new FileInputStream(pathName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    }
}
