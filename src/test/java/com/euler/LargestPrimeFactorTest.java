package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestPrimeFactorTest {

    private LargestPrimeFactor solution = new LargestPrimeFactor();

    @Test
    public void test() {

        long result = solution.execute(13195);

        assertEquals(29, result);
    }

    @Test
    public void test2() {

        long result = solution.execute(600851475143L);

        assertEquals(6857, result);
    }
}