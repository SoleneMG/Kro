package exo22.domain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterOrderInFile {
    private int writeCall = 1;
    private static final Logger LOGGER = Logger.getLogger(RegisterOrderInFile.class.getPackage().getName());
    /*
     public File createnewFile(String pathname, MyScanner sc) {
         File orderMenu = new File(pathname);
         try {
             if (orderMenu.createNewFile()) {
                 System.out.println("Fichier créé : " + pathname);
                 return orderMenu;
             } else
                 System.out.println("Le fichier existe déjà");
             boolean answer = sc.returnBoolean("Souhaitez-vous créer un autre fichier ? \n - oui \n - non");
             if (answer) {
                 createnewFile(pathname, sc);
             }
         } catch (IOException ioException) {
             ioException.printStackTrace();
         }
         throw new RuntimeException("Erreur inattendue : " + orderMenu);
     }
    */

    public void write(String pathName, StringBuilder menu) {
        Object[] data = {writeCall};
        LOGGER.log(Level.INFO, "(avant) writeCall = {0}", data);
        try {
            FileWriter fileWriter = new FileWriter(pathName, true);
            BufferedWriter writeOutput = new BufferedWriter(fileWriter);
            writeOutput.write("Commande n°" + writeCall + " : ");
            writeCall++;
            LOGGER.log(Level.INFO, "(après) writeCall = {0}", data);
            writeOutput.write(String.valueOf(menu));
            writeOutput.flush();
            writeOutput.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
