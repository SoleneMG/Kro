package main.exo25.data.database;

import main.exo25.data.models.Person;
import main.exo25.data.models.Price;

import java.util.List;

public interface Database {
    void addPerson(Person person);
    boolean exist(String lastName, String firstName);
    List<Person> getAllPerson();
    List<Price> getAllPrice();
}
