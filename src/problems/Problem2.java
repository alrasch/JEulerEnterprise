package problems;

import math.sequences.Fibonacci;

import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        int solution = problem.solve();
        System.out.println(solution);
    }

    public int solve() {
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> list = fibonacci.getTermsLowerThan(4000000);

        int sum = 0;
        for (int n : list) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum;
    }
}
