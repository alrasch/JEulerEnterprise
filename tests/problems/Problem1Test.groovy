package problems

import org.junit.Test

class Problem1Test extends GroovyTestCase {

    @Test
    void testSolve() {
        Problem1 problem = new Problem1()
        assertEquals(233168, problem.solve())
    }
}
