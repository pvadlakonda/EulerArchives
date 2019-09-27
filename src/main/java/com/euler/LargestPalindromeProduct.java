package com.euler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LargestPalindromeProduct {

    public long execute(int maxNum) {
        Set<Long> palindromes = new HashSet<>();

        for (int i = maxNum; i > 0; i--) {
            for (int j = maxNum; j > 0; j--) {
                long sum = i * j ;
                if (isPalindrome(sum)) {
                    palindromes.add(sum);
                }
            }
        }

        return Collections.max(palindromes);
    }

    private boolean isPalindrome(long num) {
        String original = num + "", reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        return original.equals(reverse);
    }
}
