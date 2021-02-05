package main.exo25.presentation;

import main.exo25.data.models.*;
import main.exo25.domain.order.OrderLogic;
import main.exo9.MyScanner;
import javafx.util.Pair;

import java.util.List;

public class OrderScreen extends Screen{
    private final OrderLogic orderLogic = new OrderLogic();
    public OrderScreen(ScreenManager screenManager, MyScanner myScanner) {
        super(screenManager, myScanner);
    }

    @Override
    public void display() {
        System.out.println("Récap:");
        List<Pair<Person, Price>> personWithPriceList = orderLogic.getAll();

        for(Pair<Person, Price> personPricePair : personWithPriceList){
            Person person = personPricePair.getKey();
            Price price = personPricePair.getValue();

            System.out.println("- " + person.lastName + " " + person.firstName + " " + person.age + " (" + describePerson(person) +") = "+ price.value + "€");
        }
    }

    private String describePerson(Person person){
        if(person instanceof Baby){
            return "Bébé";
        } else if (person instanceof Child) {
            return "Enfant";
        } else if(person instanceof Adult) {
            return "Adulte";
        }

        throw new IllegalArgumentException("Fallait tester ton code connard");
    }
}
