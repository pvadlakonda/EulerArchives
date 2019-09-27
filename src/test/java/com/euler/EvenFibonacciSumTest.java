package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvenFibonacciSumTest {

    private EvenFibonacciSum solution = new EvenFibonacciSum();

    @Test
    public void shouldReturn44WhenMaxIs100() {

        long result = solution.execute(100);

        assertEquals(44, result);

    }

    @Test
    public void shouldReturn4613732WhenMaxIs4000000() {

        long result = solution.execute(4000000);

        assertEquals(4613732, result);

    }
}