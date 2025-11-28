package ru.renatlearningproject.annotations;

import org.junit.jupiter.api.Test;
import ru.renatlearningproject.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    public void factorialTest() {

        Factorial factorial = new Factorial();
        int actualResult = factorial.factorial(4);
        assertEquals(24, actualResult);
    }

}