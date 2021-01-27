package exo23.domain;

import exo23.models.Child;
import exo9.MyScanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Register {

    public List<Child> children(MyScanner sc){
        boolean restart;
        List<Child> childrenList = new ArrayList<>();

        do{
            String name = sc.returnString("Nom de l'enfant :");
            String firstName = sc.returnString("Prénom de l'enfant :");
            LocalDate birthDay = sc.returnDate("Date de naissance de l'enfant :");
            Child child = new Child(name, firstName, birthDay);
            System.out.println("Vous avez saisi les informations suivantes : ");
            System.out.println(child.describeYourSelf());
            boolean shouldRegisterNext = sc.returnBoolean("Voulez-vous enregistrer "+firstName+" "+name+" ? \n - oui \n - non");
            if (shouldRegisterNext){
                childrenList.add(child);
            } else {
                System.out.println(firstName+ " " +name+"n'a pas été enregistré");
            }
           restart = sc.returnBoolean("Souhaitez-vous enregistrer un autre enfant ? \n - oui \n - non");
        } while (restart);
        return childrenList;
    }
}
