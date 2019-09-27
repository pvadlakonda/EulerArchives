package com.euler;

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
