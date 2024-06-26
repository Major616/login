package com.example.login;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator calculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator(); // Initialization
    }

    public void testAdd() {
        int expected = 30; // 10 + 20 should be 30
        int actual = calculator.add(10, 20);
        assertEquals(expected, actual);
    }

    public void testMul() {
        int exp = 20; // 5 * 4 should be 20
        int act = calculator.multiply(5, 4);
        assertEquals(exp, act);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}

