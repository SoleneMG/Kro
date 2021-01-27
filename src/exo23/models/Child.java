package exo23.models;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Child {
    final String name;
    final String firstName;
    final LocalDate birthDate;

    public Child(String name, String firstName, LocalDate birthDate) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public String describeYourSelf(){
        return "Nom : "+name+" | Prénom : "+firstName+" | Date de naissance : "+birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int calculateAge(LocalDate currentDate){
        return Period.between(birthDate, currentDate).getYears();
    }
}
