package ru.renatlearningproject.annotations;

import org.junit.jupiter.api.*;
import ru.renatlearningproject.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator Operations Test")
public class CalculatorTest {

    @BeforeEach
    void setUp(){
        System.out.println("setUpMethod is calling");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown is calling");
    }

    @DisplayName("Test Addition of Two Numbers")
//    @Test
//    @RepeatedTest(5)
    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    void addTest() {
        Calculator calculator = new Calculator();
        int addition = calculator.add(2, 3);

        assertEquals(5, addition);
    }

    @Disabled ("Temporarily disabled")
    @DisplayName("Test Subtraction of Two Numbers")
    @Test
    void subtractTest() {
        Calculator calculator = new Calculator();
        int subtraction = calculator.subtract(3, 2);

        assertEquals(1, subtraction);
    }
}
