package math.prime;

import java.util.ArrayList;

public class Prime {

    private ArrayList<Long> primes;

    public Prime() {
        this.primes = new ArrayList<Long>();
    }

    private void init() {
        if (this.primes.size() == 0) {
            this.primes.add(2L);
        }
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }

        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Generates the next prime in this.primes
     */
    public void generateNext() {
        this.init();
        long last = this.primes.get(this.primes.size() - 1);
        if (last == 2) {
            this.primes.add(3L);
            return;
        }

        last += 2;

        while (!isPrime(last)) {
            last += 2;
        }

        this.primes.add(last);
    }

    private void generatePrimesUpTo(long n) {
        this.init();
        while (this.primes.get(this.primes.size() - 1) < n) {
            this.generateNext();
        }
    }

    public ArrayList<Long> getPrimeFactors(long n) throws Exception {
        ArrayList<Long> primeFactors = new ArrayList<Long>();

        if (n < 2) {
            throw new Exception("Tried prime-factoring something less than 2.");
        }

        if (isPrime(n)) {
            primeFactors.add(n);
            return primeFactors;
        }

        this.generatePrimesUpTo(n / 2 + 1);

        for (long prime : this.primes) {
            if (n % prime == 0) {
                primeFactors.add(prime);
            }
            System.out.println("2");
        }

        return primeFactors;
    }

    public long getSmallestPrimeFactor(long n) {
        this.init();
        long current = this.primes.get(this.primes.size() - 1);
        while (n % current != 0) {
            this.generateNext();
            current = this.primes.get(this.primes.size() - 1);
        }
        return current;
    }

    public long getLargestPrimeFactor(long n) throws Exception {
        if (n < 2) {
            throw new Exception("Tried to get prime factors of n < 2.");
        }

        if (this.isPrime(n)) {
            return n;
        }

        long smallestFactor = this.getSmallestPrimeFactor(n);

        long largestFactor = n / smallestFactor;

        while (!isPrime(largestFactor)) {
            largestFactor = this.getLargestPrimeFactor(largestFactor);
        }

        return largestFactor;
    }
}
