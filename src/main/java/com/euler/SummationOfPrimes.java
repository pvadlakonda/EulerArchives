package com.euler;

public class SummationOfPrimes {

    public long execute(int limit) {
        long sum = 2;
        for (int i = 3; i < limit; i = i + 2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
