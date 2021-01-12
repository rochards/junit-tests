package com.rochards.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void initCalculator() {
        calc = new Calculator();
    }

    @Test
    public void testSum() {
        int sum = calc.sum(2, 4);
        assertEquals(6, sum);
    }

    @Test
    public void testSub() {
        int sub = calc.sub(2, 4);
        assertEquals(-2, sub);
    }

    @Test
    public void testMult() {
        int mult = calc.mult(2, 4);
        assertEquals(8, mult);
    }

    @Test
    public void testDiv() {
        double div = calc.div(2, 4);
        assertEquals(0.5, div, 0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        double div = calc.div(2, 0);
    }

    /*@Test
    public void testSumWithMock() {
       Calculator calc = mock(Calculator.class);

       when(calc.sum("1+2")).thenReturn(3);

       int result = calc.sum("1+2");
       assertEquals(3, result);
    }*/
}
