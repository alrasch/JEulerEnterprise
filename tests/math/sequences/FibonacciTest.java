package math.sequences;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void testGetSequenceUpTo() {
        Fibonacci fibonacci = new Fibonacci();

        ArrayList<Integer> fib3 = fibonacci.getSequenceUpTo(3);
        ArrayList<Integer> fib3Expected = new ArrayList<Integer>(Arrays.asList(1, 1, 2));

        for (int i = 0; i < fib3.size(); i++) {
            assertEquals(fib3.get(i), fib3Expected.get(i));
        }

        ArrayList<Integer> fib10 = fibonacci.getSequenceUpTo(10);
        ArrayList<Integer> fib10Expected = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55));

        for (int i = 0; i < fib10.size(); i++) {
            assertEquals(fib10.get(i), fib10Expected.get(i));
        }
    }

    @Test
    void testGetTermsLowerThan() {
        Fibonacci fibonacci = new Fibonacci();

        Object[] fib3 = fibonacci.getTermsLowerThan(3).toArray();
        int[] fib3Expected = {1, 1, 2};
        for (int i = 0; i < fib3.length; i++) {
            assertEquals(fib3[i], fib3Expected[i]);
        }

        Object[] fib60 = fibonacci.getTermsLowerThan(60).toArray();
        int[] fib60Expected = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        for (int i = 0; i < fib60.length; i++) {
            assertEquals(fib60[i], fib60Expected[i]);
        }
    }
}
