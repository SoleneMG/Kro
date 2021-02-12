package main.exo25.domain.order;

import main.exo25.data.database.Database;
import main.exo25.data.models.Person;
import main.exo25.data.models.Price;
import javafx.util.Pair;

import java.util.List;
import java.util.stream.Collectors;

public class OrderLogic {
    private final Database database;

    public OrderLogic(Database database) {
        this.database = database;
    }

    public List<Pair<Person, Price>> getAll() {
        List<Price> priceList = database.getAllPrice();
        List<Person> personList = database.getAllPerson();

        return personList.stream().map(person -> (new Pair<>(person, getJustPrice(priceList,person)))).collect(Collectors.toList());
    }

    private Price getJustPrice(List<Price> priceList, Person person) {
        for(int i = priceList.size()-1; i >= 0; i--){
            if(person.age >= priceList.get(i).getMinAge())
                return priceList.get(i);
        }

        throw new IllegalArgumentException("manque un prix > 0");
    }
}
