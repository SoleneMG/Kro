package exo23.domain;

import exo23.models.Child;
import exo23.utils.LogsUtils;
import exo9.MyScanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
    String className = Register.class.getPackage().getName();
    Logger LOGGER = LogsUtils.getLogger(className);

    public List<Child> children(MyScanner sc){
        boolean restart;
        List<Child> childrenList = new ArrayList<>();

        do{
            String name = sc.returnString("Nom de l'enfant :");
            String firstName = sc.returnString("Prénom de l'enfant :");
            LocalDate birthDay = sc.returnLocalDate("Date de naissance de l'enfant :");
            Child child = new Child(name, firstName, birthDay);
            System.out.println("Vous avez saisi les informations suivantes : ");
            System.out.println(child.describeYourSelfWithBirthDate());
            boolean shouldRegisterNext = sc.returnBoolean("Voulez-vous enregistrer "+firstName+" "+name+" ? \n - oui \n - non");
            if (shouldRegisterNext){
                childrenList.add(child);
                LOGGER.log(Level.INFO,firstName+" "+name+" ajouté");
            } else {
                System.out.println(firstName+ " " +name+"n'a pas été enregistré");
            }
           restart = sc.returnBoolean("Souhaitez-vous enregistrer un autre enfant ? \n - oui \n - non");
        } while (restart);
        return childrenList;
    }
}
