package com.euler;

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
