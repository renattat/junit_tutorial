package ru.renatlearningproject.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.renatlearningproject.MathUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvSourceDemoTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 1111",
            "5, 120",
    })
    void factorialTest(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factorial(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/factorial_data.scv")
    void factorialTestUsingCsvFileSource(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factorial(number));
    }
}
