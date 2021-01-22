package exo22.domain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterOrderInFile {
        int writeCall = 1;
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
        try {
            FileWriter fileWriter = new FileWriter(pathName, true);
            BufferedWriter writeOutput = new BufferedWriter(fileWriter);
            writeOutput.write("Commande n°" + writeCall + " : ");
            writeCall++;
            writeOutput.write(String.valueOf(menu));
            writeOutput.flush();
            writeOutput.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
