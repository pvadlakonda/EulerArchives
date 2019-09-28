package com.euler20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.euler.Sample;

class HighestDivisibleTriangularNumberTest {

    private  HighestDivisibleTriangularNumber solution = new HighestDivisibleTriangularNumber();

    @Test
    public void shouldReturn28AsAtleast5DivisibleTriangular() {

        int result = solution.execute(5);

        assertEquals(28, result);
    }

    @Test
    public void shouldReturn28AsAtleast500DivisibleTriangular() {

        int result = solution.execute(500);

        assertEquals(76576500, result);
    }
}