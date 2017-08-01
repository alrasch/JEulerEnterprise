package math.prime;

import java.util.ArrayList;

public class Prime {

    private ArrayList<Long> primes;

    public Prime() {
        this.primes = new ArrayList<>();
    }

    private void init() {
        this.primes = new ArrayList<>();
        this.primes.add(2L);
    }

    boolean isPrime(long n) {
        if (n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
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
    private void generateNext() {
        if (this.primes.size() == 0) {
            this.primes.add(2L);
        }

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

    public ArrayList<Long> getPrimesUpTo(long n) {
        this.generatePrimesUpTo(n);
        return this.primes;
    }

    private void generatePrimesUpTo(long n) {
        this.init();
        while (this.primes.get(this.primes.size() - 1) < n) {
            this.generateNext();
        }
        this.primes.remove(this.primes.size() - 1);
    }

    public ArrayList<Long> getPrimeFactors(long n) throws Exception {
        ArrayList<Long> primeFactors = new ArrayList<>();

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
        }

        return primeFactors;
    }

    public long getSmallestPrimeFactor(long n) {
        this.init();
        if (this.isPrime(n)) {
            return n;
        }

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
