package problems.batch1;

import math.sequences.Fibonacci;

import java.util.ArrayList;

public class Problem2 {
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
