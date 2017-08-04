package math.prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    @Test
    void testIsPrime() {
        Prime prime = new Prime();

        int[] primes1 = {2, 3, 5, 7};
        int[] primes4 = {6917,6947,6949,6959,6961,6967,6971,6977,6983,6991,6997,7001,7013,7019,7027,7039};
        long[] hugePrimes = {5915587277L, 34772811290242679L};

        for (int i : primes1) {
            assertTrue(prime.isPrime(i));
        }

        for (int i : primes4) {
            assertTrue(prime.isPrime(i));
        }

        for (long i : hugePrimes) {
            assertTrue(prime.isPrime(i));
        }
    }

    @Test
    void testIsNotPrime() {
        Prime prime = new Prime();

        int[] composites1 = {1, 4, 6, 8, 9};
        int[] composites2 = {10, 12, 14, 15, 16, 18, 20, 21, 22};
        long[] hugeComposites = {5915587279L, 92233720368547707L};

        for (int i : composites1) {
            assertFalse(prime.isPrime(i));
        }

        for (int i : composites2) {
            assertFalse(prime.isPrime(i));
        }

        for (long i : hugeComposites) {
            assertFalse(prime.isPrime(i));
        }
    }

    @Test
    void testGetSmallestPrimeFactor() {
        Prime prime = new Prime();
        long[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1924712};
        long[] primes  = {2, 3, 2, 5, 2, 7, 2, 3, 2, 11, 2, 13, 2, 3, 2, 2};

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

    @Test
    void testGetUniquePrimeFactors() {
        Prime prime = new Prime();
        long[] numbers = {
                2,
                2*3,
                2*2*3,
                2*3*5,
                5*7*11*11*13
        };
        long[][] primes = {
                {2},
                {2, 3},
                {2, 3},
                {2, 3, 5},
                {5, 7, 11, 13}
        };

        for (int i = 0; i < numbers.length; i++) {
            try {
                long[] factors = prime.getUniquePrimeFactors(numbers[i]);
                assertArrayEquals(primes[i], factors);
            } catch (Exception e ) {
                e.printStackTrace();
            }
        }
    }

    @Test
    void testGetNthPrime() {
        Prime prime = new Prime();
        int[] indices = {1, 2, 3, 4, 5, 6, 10001};
        long[] primes = {2L, 3L, 5L, 7L, 11L, 13L, 104743L};

        for(int i = 0; i < indices.length; i++){
            assertEquals(primes[i], prime.getNthPrime(indices[i]));
        }
    }
}
