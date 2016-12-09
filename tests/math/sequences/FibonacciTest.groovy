package math.sequences

import org.junit.Test

class FibonacciTest extends GroovyTestCase {

    @Test
    void testGetSequenceUpTo() {
        Fibonacci fibonacci = new Fibonacci()

        int[] fib3 = fibonacci.getSequenceUpTo(3).toArray() as int[]
        int[] fib3Expected = [1, 1, 2] as int[]
        for (int i = 0; i < fib3.length; i++) {
            assertEquals(fib3[i], fib3Expected[i])
        }

        int[] fib10 = fibonacci.getSequenceUpTo(10).toArray() as int[]
        int[] fib10Expected = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55] as int[]
        for (int i = 0; i < fib10.length; i++) {
            assertEquals(fib10[i], fib10Expected[i])
        }
    }
}
