package math.naturals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquaresTest {
    @Test
    void testGetSumOfSquares() {
        Squares squares = new Squares();

        long[][] intervals = {{1L, 100L}, {50L, 100L}};
        long[] sums = {338350L, 297925L};

        for (int i = 0; i < sums.length; i++) {
            long from = intervals[i][0];
            long to = intervals[i][1];
            assertEquals(sums[i], squares.getSumOfSquares(from, to));
        }
    }
}
