package test.exo25.domain.register;

import main.exo25.data.database.Database;
import main.exo25.data.database.memory.MemoryDatabase;
import main.exo25.domain.register.RegisterLogic;
import main.exo25.domain.register.RegisterPersonResult;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class RegisterLogicTest {
     Database database = Mockito.mock(Database.class);
    private final RegisterLogic registerLogic = new RegisterLogic(database);

    @Before
    void beforeAll() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void test_addPerson_success() {
        //Given
        String lastName = "l";
        String firstName = "ll";
        int age = 2;

        //When
        RegisterPersonResult result = registerLogic.addPerson(lastName, firstName, age);

        //Then
        assertEquals(RegisterPersonResult.SUCCESS, result);
    }

    @Test
    void test_addPerson_tooOld() {
        //Given
        String lastName = "l";
        String firstName = "ll";
        int age = 71;

        //When
        RegisterPersonResult result = registerLogic.addPerson(lastName, firstName, age);

        //Then
        assertEquals(RegisterPersonResult.TOO_OLD, result);
    }

    @Test
    void test_addPerson_alreadyExist() {
        //Given
        String lastName = "l";
        String firstName = "ll";
        int age = 69;
        Mockito.when(database.exist(lastName,firstName)).thenReturn(true);

        //When
        RegisterPersonResult result = registerLogic.addPerson(lastName, firstName, age);

        //Then
        assertEquals(RegisterPersonResult.ALREADY_EXIST, result);
    }
}