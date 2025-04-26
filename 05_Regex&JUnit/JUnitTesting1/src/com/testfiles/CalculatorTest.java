package com.testfiles;

import org.junit.jupiter.api.Test;

import com.test.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
