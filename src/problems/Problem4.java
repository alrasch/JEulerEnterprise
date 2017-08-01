package problems;

import string.*;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args){
        Problem4 p4 = new Problem4();
        System.out.println(p4.solve());
    }

    public int solve() {
        TrivialProperties tp = new TrivialProperties();
        int high = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int product = i*j;
                if (tp.isPalindrome(Integer.toString(product)) && product > high) {
                    high = product;
                }
            }
        }
        return high;
    }
}
