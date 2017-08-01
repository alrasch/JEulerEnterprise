package math.naturals;

public class Squares {
    public long getSumOfSquares(long from, long to) {
        long sum = 0L;
        for (long i = from; i <= to; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public long getSquareOfSum(long from, long to) {
        long sum = 0L;
        for (long i = from; i <= to; i++) {
            sum += i;
        }
        return (long) Math.pow(sum, 2);
    }
}
