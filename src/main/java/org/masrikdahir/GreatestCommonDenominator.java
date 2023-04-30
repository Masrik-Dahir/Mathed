package org.masrikdahir;

public class GreatestCommonDenominator {
    public int gcd(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException();
        }

        if (num1 == 0 || num2 == 0) {
            return Math.abs(num1 - num2);
        }

        while (num1 % num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num2;
    }

    public int gcd(int[] number) {
        GreatestCommonDenominator greatestCommonDenominator = new GreatestCommonDenominator();
        int result = number[0];
        for (int i = 1; i < number.length; i++) {
            result = greatestCommonDenominator.gcd(result, number[i]);
        }

        return result;
    }

}
