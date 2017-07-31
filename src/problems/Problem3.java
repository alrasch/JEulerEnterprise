package problems;

import math.prime.Prime;

public class Problem3 {
    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        problem.solve();
    }

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
