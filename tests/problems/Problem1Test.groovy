package problems

import org.junit.Test

/**
 * Created by Aleks on 03.12.2016.
 */
class Problem1Test extends GroovyTestCase {

    @Test
    void testSolve() {
        Problem1 problem = new Problem1()
        assertEquals(233168, problem.solve())
    }
}
