package org.masrikdahir;

import java.math.BigInteger;

public class Combinatorics {
    public int factorial(int number) {
        if (number < 0){
            throw new ArithmeticException("Negative Input");
        }
        int i, fact = 1;
        for (i = 1; i <= (int) number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int permutation(int n, int r) {
        if (r < 0 || r > n) {
            throw new ArithmeticException("Invalid input");
        }
        int result = 1;
        for (int i = n; i > n - r; i--) {
            result *= i;
        }
        return result;
    }

    public int combination(int n, int r) {
        if (r < 0 || r > n) {
            throw new ArithmeticException("Invalid input");
        }
        int numerator = 1;
        int denominator = 1;
        for (int i = 0; i < r; i++) {
            numerator *= n - i;
            denominator *= i + 1;
        }
        return numerator / denominator;
    }

}
