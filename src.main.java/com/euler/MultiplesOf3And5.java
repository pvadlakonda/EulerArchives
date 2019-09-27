package com.euler;

import java.util.HashSet;
import java.util.Set;

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
