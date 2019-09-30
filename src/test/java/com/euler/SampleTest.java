package com.euler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest {

    private  Sample sample = new Sample();

    @Test
    public void test() {

        int result = sample.execute(2,4);

        assertEquals(6, result);
    }
}