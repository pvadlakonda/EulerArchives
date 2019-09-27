package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestPalindromeProductTest {

    private LargestPalindromeProduct solution = new LargestPalindromeProduct();

    @Test
    public void test2Digit() {

        long result = solution.execute(99);

        assertEquals(9009, result);
    }

    @Test
    public void test3Digit() {

        long result = solution.execute(999);

        assertEquals(906609, result);
    }
}