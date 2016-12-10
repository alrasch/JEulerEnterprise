package math.prime;

import java.util.ArrayList;

public class Prime {

    private ArrayList<Integer> primes;

    public Prime () {
        this.primes = new ArrayList<Integer>();
    }

    private void init () {
        if (this.primes.size() == 0) {
            this.primes.add(2);
        }
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 3; i <= n/2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
