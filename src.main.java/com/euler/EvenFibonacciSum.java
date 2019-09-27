package com.euler;

import java.util.HashSet;
import java.util.Set;

public class EvenFibonacciSum {

    public long execute(long max) {
        long n1 = 1, n2 = 2;
        Set<Long> fibNums = new HashSet<>();
        fibNums.add(n1);
        fibNums.add(n2);

        while (n1 + n2 < max) {
            long tmp = n1 + n2;
            fibNums.add(tmp);
            n1 = n2; n2 = tmp;
        }

        Set<Long> evenFibNums = new HashSet<>();
        for (Long num : fibNums) {
            if (num % 2 == 0) {
                evenFibNums.add(num);
            }
        }

        return evenFibNums.stream().reduce(0L, Long::sum);
    }
}
