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
        if (n < 0 || r < 0){
            throw new ArithmeticException("Negative Input");
        }

        else if (r == 0){
            return 1;
        }

        else if (r > n){
            throw new ArithmeticException("R needs to be less than or equal to N");
        }
        int f1 = n;
        for (int i = n - 1; i >= 1; i--) {
            f1 = f1 * i;
        }
        int number;
        number = n - r;
        int f2 = number;
        for (int i = number - 1; i >= 1; i--) {
            f2 = f2 * i;
        }

        return f1 / f2;
    }

    public double combination(int N, int K) {
        if (N < 0 || K < 0){
            throw new ArithmeticException("Negative Input");
        }

        else if (K == 0){
            return 1;
        }

        else if (K > N){
            throw new ArithmeticException("R needs to be less than or equal to N");
        }

        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf( (long) N - k))
                    .divide(BigInteger.valueOf(k + 1));
        }
        return Integer.parseInt(String.valueOf(ret));


    }

}
