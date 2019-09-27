package com.euler;

import java.util.HashSet;
import java.util.Set;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class MultiplesOf3And5 {

    public int calculate(int limit) {
        Set<Integer> multiples = new HashSet<>();
        multiples.addAll(getMultiples(3, limit));
        multiples.addAll(getMultiples(5, limit));

        return multiples.stream().reduce(0, Integer::sum);
    }

    private Set<Integer> getMultiples(int multipleOf, int limit) {
        Set<Integer> multiples = new HashSet<>();
        int i = 1;
        while ((multipleOf * i) < limit) {
            multiples.add(multipleOf * i);
            i++;
        }

        return multiples;
    }
}
