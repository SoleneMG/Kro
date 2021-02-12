package test.exo25.domain.register;

import main.exo25.data.database.Database;
import main.exo25.domain.register.RegisterLogic;
import main.exo25.domain.register.RegisterPersonResult;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.stream.Stream;
import static main.exo25.domain.register.RegisterPersonResult.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class RegisterLogicTest {
    @Mock
    Database mockDatabase;
    @InjectMocks
    RegisterLogic registerLogic;

    @ParameterizedTest
    @MethodSource("addPersonParameters")
    void test_addPerson(String lastName, String firstName, int age, RegisterPersonResult expected){
        //Given
        if (expected == ALREADY_EXIST) {
            Mockito.when(mockDatabase.exist(lastName, firstName)).thenReturn(true);
        }
        //When
        RegisterPersonResult result = registerLogic.addPerson(lastName, firstName, age);
        //Then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> addPersonParameters(){
        return Stream.of(
                Arguments.of("", "l", 18, LASTNAME_EMPTY),
                Arguments.of(null, "l", 18, LASTNAME_EMPTY),
                Arguments.of("ll", "", 18, FIRSTNAME_EMPTY),
                Arguments.of("ll", null, 18, FIRSTNAME_EMPTY),
                Arguments.of("ll", "l", 71, TOO_OLD),
                Arguments.of("ll", "l", 118, AGE_INVALID),
                Arguments.of("ll", "l", -1, AGE_INVALID),
                Arguments.of("ll", "l", 18, SUCCESS),
                Arguments.of("ll", "l", 18, ALREADY_EXIST)

        );

    }
}