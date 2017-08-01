package problems;

import math.naturals.Squares;

public class Problem6 {
    public int solve() {
        Squares squares = new Squares();
        return (int) (squares.getSquareOfSum(1L, 100L) - squares.getSumOfSquares(1L, 100L));
    }
}
