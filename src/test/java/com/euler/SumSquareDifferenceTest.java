package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumSquareDifferenceTest {

    private  SumSquareDifference solution = new SumSquareDifference();

    @Test
    public void testFor10() {

        int result = solution.execute(10);

        assertEquals(2640, result);
    }

    @Test
    public void testFor100() {

        int result = solution.execute(100);

        assertEquals(25164150, result);
    }
}