package exo23.models;


import exo23.domain.WriteInFile;
import exo23.utils.LogsUtils;
import main.Main;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Child implements Serializable {
    String className = Child.class.getPackage().getName();
    Logger LOGGER = LogsUtils.getLogger(className);
    private static final long serialVersionUID = 1L;
    final String name;
    final String firstName;
    final LocalDate birthDate;

    public Child(String name, String firstName, LocalDate birthDate) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
        LOGGER.log(Level.INFO, this.firstName+" "+this.name+" créé");
    }

    public String describeYourSelfWithBirthDate(){
        return "Nom : "+name+" | Prénom : "+firstName+" | Date de naissance : "+birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public String describeYourSelfWithAge(){
        LocalDate currentDate = LocalDate.now();
        return "Nom : "+name+" | Prénom : "+firstName+" | Date de naissance : "+calculateAge(currentDate)+" ans";
    }

    public int calculateAge(LocalDate currentDate){
        return Period.between(birthDate, currentDate).getYears();
    }

}
