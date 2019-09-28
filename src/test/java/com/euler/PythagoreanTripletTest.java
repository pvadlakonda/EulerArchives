package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PythagoreanTripletTest {

    private  PythagoreanTriplet solution = new PythagoreanTriplet();

    @Test
    public void testFor12() {// 3,4,5

        int result = solution.execute(12);

        assertEquals(60, result);

    }

    @Test
    public void testFor1000() {// 200, 375, 425

        int result = solution.execute(1000);

        assertEquals(31875000, result);

    }
}