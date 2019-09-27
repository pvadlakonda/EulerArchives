package com.euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class SmallestMultiple {

    public int execute(int maxNum) {

        int num = maxNum;
        while (num > 0) {
            boolean isDivisible = true;
            for (int i = 1; i <= maxNum; i++) {
                if (num % i != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                return num;
            }
            num += maxNum;
        }
        return 0;
    }
}
