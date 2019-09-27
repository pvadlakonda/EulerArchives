package com.euler;

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
