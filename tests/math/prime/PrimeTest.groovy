package math.prime

import org.junit.Test

class PrimeTest extends GroovyTestCase {

    @Test
    void testIsPrime() {
        Prime prime = new Prime()

        int[] primes1 = [2, 3, 5, 7] as int[]
        int[] primes4 = [6917,6947,6949,6959,6961,6967,6971,6977,6983,6991,6997,7001,7013,7019,7027,7039] as int[]

        for (int i : primes1) {
            assertTrue(prime.isPrime(i))
        }

        for (int i : primes4) {
            assertTrue(prime.isPrime(i))
        }
    }
}
