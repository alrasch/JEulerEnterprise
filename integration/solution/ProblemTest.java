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

    @Test
    void testSolution4() {
        int solution = 906609;
        assertEquals(solution, (new Problem4().solve()));
    }

    @Test
    void testSolution5() {
        int solution = 232792560;
        assertEquals(solution, (new Problem5().solve()));
    }

    @Test
    void testSolution6() {
        int solution = 25164150;
        assertEquals(solution, (new Problem6().solve()));
    }

    @Test
    void testSolution7() {
        int solution = 104743;
        assertEquals(solution, (new Problem7().solve()));
    }

    @Test
    void testSolution8() {
        long solution = 23514624000L;
        assertEquals(solution, (new Problem8().solve()));
    }
}
