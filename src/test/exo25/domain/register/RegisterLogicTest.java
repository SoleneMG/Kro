package test.exo25.domain.register;

import main.exo25.data.database.Database;
import main.exo25.data.database.memory.MemoryDatabase;
import main.exo25.domain.register.RegisterLogic;
import main.exo25.domain.register.RegisterPersonResult;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.runners.MockitoJUnitRunner;

import static main.exo25.domain.register.RegisterPersonResult.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RegisterLogicTest {
    @Mock Database mockDatabase;
    @InjectMocks RegisterLogic registerLogic;

    @Test
    void test_addPerson_success() {
        //Given
        String lastName = "l";
        String firstName = "ll";
        int age = 2;

        //When
        RegisterPersonResult result = registerLogic.addPerson(lastName, firstName, age);

        //Then
        assertEquals(SUCCESS, result);
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
        assertEquals(TOO_OLD, result);
    }

    @Test
    void test_addPerson_alreadyExist() {
        //Given
        String lastName = "l";
        String firstName = "ll";
        int age = 69;
        when(mockDatabase.exist(lastName,firstName)).thenReturn(true);

        //When
        RegisterPersonResult result = registerLogic.addPerson(lastName, firstName, age);

        //Then
        assertEquals(ALREADY_EXIST, result);
    }
}