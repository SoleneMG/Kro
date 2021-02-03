package exo23.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogsUtils {
    private static final LogManager LOG_MANAGER = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger(LogsUtils.class.getPackage().getName());
    static FileHandler fileHandler;

    static {
        initializeLogManager();
        fileHandler = getFileHandler();
    }

    private static void initializeLogManager() {
        try {
            LOG_MANAGER.readConfiguration(new FileInputStream("logs.properties"));
        } catch (IOException ioException) {
            LOGGER.log(Level.SEVERE, "Erreur de configuration du LOGGER", ioException);
        }
    }

    private static FileHandler getFileHandler() {
        try {
            return new FileHandler("saveLogs.txt");
        } catch (IOException ioException) {
            LOGGER.log(Level.SEVERE, "Erreur lors de l'enregistrement dans le fichier Logs", ioException);
        }
        return null;
    }

    public static Logger getLogger(String classLogName) {
        Logger LOGGER = Logger.getLogger(classLogName);
        LOGGER.addHandler(fileHandler);
        return LOGGER;
    }
}
