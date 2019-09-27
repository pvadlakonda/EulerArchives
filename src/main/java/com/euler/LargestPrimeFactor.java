package com.euler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LargestPrimeFactor {

    public long execute(long number) {
        Set<Long> primeFactors = new HashSet<>();

        for (long i = 2; i < number/2; i++) {
            if (number % i == 0 && isPrime(i)) {
                primeFactors.add(i);
            }
        }

        return Collections.max(primeFactors);
    }

    private boolean isPrime(long number) {
        int i = 2;

        while (i <= number / 2) {
            if (number % i == 0) {
                return false;
            }
            ++i;
        }

        return true;
    }
}
