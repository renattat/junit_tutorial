package ru.renatlearningproject.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ArgumentsSources;
import ru.renatlearningproject.MathUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentProviderDemoTest {

    @ParameterizedTest
    @ArgumentsSource(FactorialArgumentsProvider.class)
    void factorialTest(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factorial(number));
    }
}
