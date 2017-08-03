package problems.batch1;

import math.prime.Prime;

public class Problem3 {
    public long solve() {
        Prime prime = new Prime();

        long solution = -1;
        try {
            solution = prime.getLargestPrimeFactor(600851475143L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return solution;
    }
}
