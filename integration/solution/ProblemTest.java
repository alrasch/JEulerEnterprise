package solution;

import org.junit.jupiter.api.Test;
import problems.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemTest {
    @Test
    void testSolution1() {
        int solution = 233168;
        assertEquals(solution, (new Problem1().solve()));
    }

    @Test
    void testSolution2() {
        int solution = 4613732;
        assertEquals(solution, (new Problem2().solve()));
    }

    @Test
    void testSolution3() {
        int solution = 6857;
        assertEquals(solution, (new Problem3().solve()));
    }
}