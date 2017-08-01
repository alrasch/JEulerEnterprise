package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrivialPropertiesTest {
    @Test
    void testIsPalindrome() {
        TrivialProperties tp = new TrivialProperties();

        String[] palindromes = {
                "a",
                "aa",
                "aba",
                "abba",
                "abcba",
                "9009",
                "god dog"
        };

        for(String palindrome : palindromes) {
            assertTrue(tp.isPalindrome(palindrome));
        }
    }

    @Test
    void testIsNotPalindrome() {
        TrivialProperties tp = new TrivialProperties();

        String[] nonPalindromes = {
                "ab",
                "abb",
                "abab",
                "abcab",
                "9090",
                "dog dog"
        };

        for (String nonPalindrome : nonPalindromes) {
            assertFalse(tp.isPalindrome(nonPalindrome));
        }
    }

}