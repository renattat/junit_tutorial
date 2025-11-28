package ru.renatlearningproject.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.renatlearningproject.Days;
import ru.renatlearningproject.MathUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumSourceDemoTest {

    @ParameterizedTest
    @EnumSource(value = Days.class, names = {"SUNDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"})
    void isWeekdayTest(Days day) {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isWeekDay(day));
    }
}
