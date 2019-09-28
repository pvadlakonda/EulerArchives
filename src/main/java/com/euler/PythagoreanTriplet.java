package com.euler;

/**
 *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

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
