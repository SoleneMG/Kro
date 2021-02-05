package main.exo23.domain;

import main.exo23.models.Child;
import main.exo23.utils.LogsUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static main.exo23.utils.StreamUtils.close;
import static main.exo23.utils.StreamUtils.flush;

public class WriteInFile {
    String className = WriteInFile.class.getPackage().getName();
    Logger LOGGER = LogsUtils.getLogger(className);
    public void children(String pathName, List<Child> childrenList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pathName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(childrenList);
        } catch (FileNotFoundException fileNotFoundException) {
            LOGGER.log(Level.INFO,"Fichier non trouvé");
        } catch (IOException ioException) {
            LOGGER.log(Level.INFO, "IOException");
        } catch (Exception exception) {
            LOGGER.log(Level.INFO, "Exception soulevée" + exception);
        } finally {
            close(fileOutputStream);
            flush(objectOutputStream);
            close(objectOutputStream);
        }
    }
}

