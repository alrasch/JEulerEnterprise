package math.sequences;

import java.util.ArrayList;

public class Fibonacci {

    private ArrayList<Integer> fibonacci;

    public Fibonacci () {
        this.fibonacci = new ArrayList<Integer>();
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
     * Generates the next term of the Fibonacci sequence
     */
    private void generateNext() {
        if (this.fibonacci.size() == 0) {
            this.fibonacci.add(1);
            this.fibonacci.add(2);
        } else {
            int next = this.fibonacci.get(this.fibonacci.size()-1) + this.fibonacci.get(this.fibonacci.size()-2);
            this.fibonacci.add(next);
        }
    }
}
