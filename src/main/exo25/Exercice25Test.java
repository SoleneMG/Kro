package main.exo25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class Exercice25Test {

    @Mock String s;

    @Test
    void test_1() {
        assertEquals(true, true);
    }
}