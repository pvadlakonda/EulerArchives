package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SummationOfPrimesTest {

    private  SummationOfPrimes solution = new SummationOfPrimes();

    @Test
    public void shouldReturn17ForPrimeNumbersUnder10() {

        long result = solution.execute(10);

        assertEquals(17, result);
    }

    @Test
    public void shouldReturn142913828922ForPrimeNumbersUnder2Million() {

        long result = solution.execute(2000000);

        assertEquals(142913828922L, result);
    }
}