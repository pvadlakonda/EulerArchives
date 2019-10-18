package com.euler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {

    public long execute(long number) {
        long result = 0;

        for (long i = 2; i < number/2; i++) {
            if (isFactor(number, i) && isPrime(i)) {
                result = Math.max(result, i);
            }
        }

        return result;
    }

    private boolean isFactor(long number, long i) {
        return number % i == 0;
    }

    private boolean isPrime(long number) {
        int i = 2;

        while (i <= number / 2) {
            if (isFactor(number, i)) {
                return false;
            }
            ++i;
        }

        return true;
    }
}
