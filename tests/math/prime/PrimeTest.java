package math.prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTest {
    @Test
    void testIsPrime() {
        Prime prime = new Prime();

        int[] primes1 = {2, 3, 5, 7};
        int[] primes4 = {6917,6947,6949,6959,6961,6967,6971,6977,6983,6991,6997,7001,7013,7019,7027,7039};

        for (int i : primes1) {
            assertTrue(prime.isPrime(i));
        }

        for (int i : primes4) {
            assertTrue(prime.isPrime(i));
        }
    }

    @Test
    void testIsNotPrime() {
        Prime prime = new Prime();

        int[] nonPrimes1 = {1, 4, 6, 8};
        int[] nonPrimes2 = {10, 12, 14, 15, 16, 18, 20, 21, 22};

        for (int i : nonPrimes1) {
            assertFalse(prime.isPrime(i));
        }

        for (int i : nonPrimes2) {
            assertFalse(prime.isPrime(i));
        }
    }

    @Test
    void testGetSmallestPrimeFactor() {
        Prime prime = new Prime();
        long[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        long[] primes  = {2, 3, 2, 5, 2, 7, 2, 3, 2, 11, 2, 13, 2, 3, 2};

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(primes[i], prime.getSmallestPrimeFactor(numbers[i]));
        }
    }

    @Test
    void testGetLargestPrimeFactor() {
        Prime prime = new Prime();
        long[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1924712};
        long[] primes = {2, 3, 2, 5, 3, 7, 2, 3, 5, 11, 3, 13, 7, 5, 2, 240589};

        for (int i = 0; i < numbers.length; i++) {
            try {
                assertEquals(primes[i], prime.getLargestPrimeFactor(numbers[i]));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
