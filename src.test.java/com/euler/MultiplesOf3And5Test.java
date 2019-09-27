package com.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplesOf3And5Test {
    MultiplesOf3And5 solution = new MultiplesOf3And5();

    @Test
    public void shouldReturn23WhenLimitIs10() {
        int result = solution.calculate(10);

        assertEquals(23, result);
    }

    @Test
    public void shouldReturn233168WhenLimitIs1000() {
        int result = solution.calculate(1000);

        assertEquals(233168, result);
    }
}