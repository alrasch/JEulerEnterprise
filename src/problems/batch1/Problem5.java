package problems.batch1;

import math.prime.Prime;

import java.util.ArrayList;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public int solve() {
        Prime prime = new Prime();
        ArrayList<Long> primes = prime.getPrimesUpTo(20);

        int product = 1;
        for(long p : primes) {
            product *= p;
        }

        for (int i = 2; i <= 20; i++) {
            if (product % i != 0) {
                product *= prime.getSmallestPrimeFactor(i);
            }
        }

        return product;
    }
}
