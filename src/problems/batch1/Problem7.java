package problems.batch1;

import math.prime.Prime;

public class Problem7 {
    public long solve() {
        Prime prime = new Prime();
        return prime.getNthPrime(10001);
    }
}
