package com.euler;

public class PythagoreanTriplet {

    public int execute(int sum) {

        for (int i = 2; i < sum / 2; i++) {

            for (int j = i + 1; j < sum / 2; j++) {

                int c = (sum) - (i + j);

                if (isPythagoreanTriplet(i, j, c)) {
                    return i * j * c;
                }
            }
        }
        return 0;
    }

    private boolean isPythagoreanTriplet(int a, int b, int c) {
        if (((a * a) + (b * b)) == (c * c)) {
            System.out.println(" " + a + " " + b + " " + c);
            return true;
        }
        return false;
    }
}
