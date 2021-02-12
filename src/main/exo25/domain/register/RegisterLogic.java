package main.exo25.domain.register;

import main.exo25.Exercice25;
import main.exo25.data.database.Database;
import main.exo25.data.models.Adult;
import main.exo25.data.models.Baby;
import main.exo25.data.models.Child;
import main.exo25.data.models.Person;

import java.util.Arrays;

public class RegisterLogic {
    private final Database database;

    public RegisterLogic(Database database) {
        this.database = database;
    }

    public RegisterPersonResult addPerson(String lastName, String firstName, int age){
        if(age < 0 || age > 110)
            return RegisterPersonResult.AGE_INVALID;
        if( age > 70)
            return RegisterPersonResult.TOO_OLD;

        if(lastName == null)
            return RegisterPersonResult.LASTNAME_EMPTY;

        if(lastName.isEmpty())
            return RegisterPersonResult.LASTNAME_EMPTY;

        if(firstName == null)
            return RegisterPersonResult.FIRSTNAME_EMPTY;

        if(firstName.isEmpty())
            return RegisterPersonResult.FIRSTNAME_EMPTY;

        if(database.exist(lastName,firstName))
            return RegisterPersonResult.ALREADY_EXIST;

        database.addPerson(createPerson(lastName,firstName,age));
        return RegisterPersonResult.SUCCESS;
    }

    private Person createPerson(String lastName, String firstName, int age) {
        if(age < 3)
            return new Baby(firstName,lastName,age);
        else if(age < 18)
            return new Child(firstName,lastName,age);
        else
            return new Adult(firstName,lastName,age);
    }
}
