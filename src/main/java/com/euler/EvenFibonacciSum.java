package com.euler;

import java.util.HashSet;
import java.util.Set;

public class EvenFibonacciSum {

    public long execute(long max) {
        long n1 = 1, n2 = 2;
        Set<Long> evenFibNums = new HashSet<>();

        evenFibNums.add(n2);

        while (n1 + n2 < max) {
            long tmp = n1 + n2;
            if (tmp % 2 == 0) {
                evenFibNums.add(tmp);
            }
            n1 = n2; n2 = tmp;
        }

        return evenFibNums.stream().reduce(0L, Long::sum);
    }
}
