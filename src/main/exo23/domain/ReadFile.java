package main.exo23.domain;

import main.exo23.models.Child;
import main.exo23.utils.LogsUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static main.exo23.utils.StreamUtils.close;

public class ReadFile {
    String className = ReadFile.class.getPackage().getName();
    Logger LOGGER = LogsUtils.getLogger(className);

    public List<Child> returnChildrenList(String pathName) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(pathName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Child>) objectInputStream.readObject();
        } catch (FileNotFoundException fileNotFoundException) {
            LOGGER.log(Level.INFO, "File not found");
        } catch (IOException ioException) {
            LOGGER.log(Level.INFO, "IOException");
        } catch (Exception exception) {
            LOGGER.log(Level.INFO, "Exception soulevée"+exception);
        } finally {
            close(fileInputStream);
            close(objectInputStream);
        }
        LOGGER.log(Level.INFO, "Liste nulle");
        return null;
    }

    public void displayChildrenList(List<Child> childrenList) {
        for (Child child : childrenList) {
            System.out.println(child.describeYourSelfWithAge());
        }
        System.out.println("Total nombre d'enfants : " + childrenList.size());
    }
}

