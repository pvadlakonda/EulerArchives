package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmallestMultipleTest {

    private  SmallestMultiple solution = new SmallestMultiple();

    @Test
    public void test1To10() {

        int result = solution.execute(10);

        assertEquals(2520, result);
    }

    @Test
    public void test1To20() {

        int result = solution.execute(20);

        assertEquals(232792560, result);
    }
}