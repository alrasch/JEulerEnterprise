package math.prime;

import math.Division;

import java.util.ArrayList;

public class Prime {

    private ArrayList<Long> primes;

    public Prime() {
        this.primes = new ArrayList<>();
    }

    private void init() {
        if (this.primes.size() == 0) {
            this.primes.add(2L);
        }
    }

    public boolean isPrime(long n) {
        if (n == 1L) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        Division d = new Division();

        long smallestDivisor = d.getSmallestProperDivisor(n);

        if (n == smallestDivisor) {
            return true;
        }

        return false;
    }

    /**
     * Generates the next prime in this.primes
     */
    private void generateNext() {
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

    private boolean isPrimeHard(long n) {
        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long getNthPrime(int n) {
        this.init();
        while (this.primes.size() < n) {
            this.generateNext();
        }
        return this.primes.get(this.primes.size()-1);
    }

    private void generatePrimesUpTo(long n) {
        this.init();
        while (this.primes.get(this.primes.size() - 1) < n) {
            this.generateNext();
        }
        if (this.primes.get(this.primes.size() - 1) > n) {
            this.primes.remove(this.primes.size() - 1);
        }
    }

    public long[] getPrimesUpTo(long n) {
        this.init();
        this.generatePrimesUpTo(n);
        return this.primes.stream().mapToLong(l -> l).toArray();
    }

    public long[] getUniquePrimeFactors(long n) throws Exception {
        ArrayList<Long> primeFactors = new ArrayList<>();

        if (n < 2) {
            throw new Exception("Tried prime-factoring something less than 2.");
        }

        if (isPrime(n)) {
            primeFactors.add(n);
            return primeFactors.stream().mapToLong(l -> l).toArray();
        }

        long[] primes = this.getPrimesUpTo(n / 2 + 1);

        for (long prime : primes) {
            if (n % prime == 0) {
                primeFactors.add(prime);
            }
        }

        return primeFactors.stream().mapToLong(l -> l).toArray();
    }

    public long getSmallestPrimeFactor(long n) {
        this.init();
        if (this.isPrime(n)) {
            return n;
        }

        for (long prime : this.primes) {
            if (n % prime == 0) {
                return prime;
            }
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

        long[] divisors = (new Division()).getDivisors(n, true, false);
        for (long div : divisors) {
            if (this.isPrime(div)) {
                return div;
            }
        }

        return -1;
    }
}
