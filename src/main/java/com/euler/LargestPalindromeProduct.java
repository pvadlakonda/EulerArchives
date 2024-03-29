package com.euler;

import java.util.HashSet;
import java.util.Set;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class LargestPalindromeProduct {

    public long execute(int maxNum) {
        Set<Long> palindromes = new HashSet<>();
        long result = 0;

        for (int i = maxNum; i > 0; i--) {
            for (int j = maxNum; j > 0; j--) {
                long product = i * j;
                if (isPalindrome(product)) {
                    result = Math.max(result, product);
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(long num) {
        String original = num + "", reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        return original.equals(reverse);
    }
}
