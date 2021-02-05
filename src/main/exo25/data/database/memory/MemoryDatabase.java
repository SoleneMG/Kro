package main.exo25.data.database.memory;

import main.exo25.data.database.Database;
import main.exo25.data.models.Person;
import main.exo25.data.models.Price;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryDatabase implements Database {
    private List<Person> personList = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public boolean exist(String lastName, String firstName) {
        return personList.stream().anyMatch(person -> (person.lastName.equalsIgnoreCase(lastName) && person.firstName.equalsIgnoreCase(firstName)));
    }

    @Override
    public List<Person> getAllPerson() {
        return personList;
    }

    @Override
    public List<Price> getAllPrice() {
        return Arrays.asList(new Price(0, 0),
                new Price(30, 3),
                new Price(40, 12),
                new Price(60.99f, 18))
                .stream()
                .sorted(Comparator.comparingInt(Price::getMinAge))
                .collect(Collectors.toList());
    }
}
