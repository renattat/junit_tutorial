package ru.renatlearningproject.parameterized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.renatlearningproject.MathUtils;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceDemoTest {

    @Test
    void isEvenTest() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isEven(2));
        System.out.println(1);
        assertTrue(mathUtils.isEven(4));
        System.out.println(2);
        assertTrue(mathUtils.isEven(6));
        System.out.println(3);
        assertTrue(mathUtils.isEven(8));
        System.out.println(4);
        assertTrue(mathUtils.isEven(10));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,6,8,10})
    void isEvenTestParams(int number) {
        MathUtils mathUtils = new MathUtils();
        System.out.println("Inside test");
        assertTrue(mathUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello","Junit","Parameterized","Test"})
    void valueSourceTest(String stringParameter) {
      assertNotNull(stringParameter);
    }
}
