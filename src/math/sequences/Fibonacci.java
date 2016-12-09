package math.sequences;

import java.util.ArrayList;

public class Fibonacci {

    private ArrayList<Integer> fibonacci;

    public Fibonacci () {
        this.fibonacci = new ArrayList<Integer>();
    }

    private void init () {
        if (this.fibonacci.size() == 0) {
            this.generateNext();
        }
    }

    /**
     * @param n - How many terms
     * @return - First n terms of the Fibonacci sequence
     */
    public ArrayList<Integer> getSequenceUpTo(int n) {
        while (this.fibonacci.size() < n) {
            this.generateNext();
        }
        return this.fibonacci;
    }

    /**
     * Returns the Fibonacci sequence up to a maximum term size
     * @param n - Max size of last element in sequence
     * @return - Fibonacci terms up to n
     */
    public ArrayList<Integer> getTermsLowerThan(int n) {
        this.init();
        while (this.fibonacci.get(this.fibonacci.size()-1) < n) {
            this.generateNext();
        }
        if (this.isLastElementGreaterThanOrEqual(n)) {
            this.removeLastElement();
        }
        return this.fibonacci;
    }

    private boolean isLastElementGreaterThanOrEqual (int n) {
        return this.fibonacci.get(this.fibonacci.size() - 1) >= n;
    }

    private void removeLastElement () {
        this.fibonacci.remove(this.fibonacci.size() - 1);
    }

    /**
     * Generates the next term of the Fibonacci sequence
     */
    private void generateNext() {
        if (this.fibonacci.size() == 0) {
            this.fibonacci.add(1);
            this.fibonacci.add(1);
        } else {
            int next = this.fibonacci.get(this.fibonacci.size()-1) + this.fibonacci.get(this.fibonacci.size()-2);
            this.fibonacci.add(next);
        }
    }
}
