package ru.renatlearningproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(10,20);

        assertEquals(30, actualResult);
    }
}