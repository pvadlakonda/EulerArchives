package com.euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */

public class NthPrime {

    public int execute(int nth) {
        int count = 0;
        int num = 1;

        while (count <= nth) {
            num++;
            if (isPrime(num)) {
                count++;
                if (count == nth) {
                    return num;
                }
            }

        }

        return 0;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
