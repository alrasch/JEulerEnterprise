package problems;

/**
 * Problem: If we list all the natural numbers
 * below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem = new Problem1();
        int solution = problem.solve();
        System.out.println(solution);
    }

    public int solve() {
        int sum = 0;

        for (int i = 3; i < 1000; i+=1) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}