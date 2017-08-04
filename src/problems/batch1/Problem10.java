package problems.batch1;

import math.prime.Prime;

public class Problem10 {
    public long solve() {
        long sum = 0L;
        int limit = 2000000; // Two million

        Prime prime = new Prime();

        long[] primes = prime.getPrimesUpTo(limit);

        for (long p : primes) {
            sum += p;
        }
        return sum;
    }
}
