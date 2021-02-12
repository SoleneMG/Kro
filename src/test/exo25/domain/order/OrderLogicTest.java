package test.exo25.domain.order;

import javafx.util.Pair;
import main.exo25.data.database.Database;
import main.exo25.data.models.Adult;
import main.exo25.data.models.Baby;
import main.exo25.data.models.Person;
import main.exo25.data.models.Price;
import main.exo25.domain.order.OrderLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
class OrderLogicTest {
    @Mock Database database;
    @InjectMocks OrderLogic orderLogic;

    @Test
    void test_getAll() {
        //Given
        Price price1 = new Price(0,3);
        Price price2 = new Price(30,18);
        List<Price> priceList = Arrays.asList(price1,price2);
        Person person1 = new Baby("fifi", "brindacier", 3);
        Person person2 = new Adult("donald", "duck", 50);
        List<Person> personList = Arrays.asList(person1, person2);
        Pair<Person, Price> pair1= new Pair<>(person1,price1);
        Pair<Person, Price> pair2= new Pair<>(person2,price2);
        List<Pair<Person,Price>> pairListExpected = Arrays.asList(pair1, pair2);
        Mockito.when(database.getAllPrice()).thenReturn(priceList);
        Mockito.when(database.getAllPerson()).thenReturn(personList);

        //When
        List<Pair<Person, Price>> result = orderLogic.getAll();

        //Then
        Assertions.assertEquals(pairListExpected, result);
    }

}