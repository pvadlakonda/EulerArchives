package com.euler;

/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {

    public int execute(int maxNum) {
        int sumOfSquares = 0;
        int sumOfNums = 0;

        for (int i = 1; i <= maxNum; i++) {
            sumOfSquares += i * i;
            sumOfNums += i;
        }

        return (sumOfNums * sumOfNums) - sumOfSquares;
    }
}
