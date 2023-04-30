package org.masrikdahir;

public class PrimeNumber {
    public boolean isPrime(int n) {
        if (n < 0) {
            throw new ArithmeticException("Negative Number");
        }
        else if (n == 2) {
            return true;
        }
        else if (n == 1 || n % 2 == 0) {
            return false;
        }

        for (int i = 3, limit = (int) Math.sqrt(n); i <= limit; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}