package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NthPrimeTest {

    private  NthPrime solution = new NthPrime();

    @Test
    public void testFor6th() {

        int result = solution.execute(6);

        assertEquals(13, result);
    }

    @Test
    public void testFor1st() {

        int result = solution.execute(1);

        assertEquals(2, result);
    }

    @Test
    public void testFor10001th() {

        int result = solution.execute(10001);

        assertEquals(104743, result);
    }
}