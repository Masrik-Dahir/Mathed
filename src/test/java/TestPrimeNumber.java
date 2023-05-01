import org.junit.jupiter.api.Test;
import org.masrikdahir.PrimeNumber;

import static org.junit.jupiter.api.Assertions.*;

public class TestPrimeNumber {

    PrimeNumber prime = new PrimeNumber();

    @Test
    public void testIsPrimeWithPrimeNumber() {
        int n = 17;
        assertTrue(prime.isPrime(n));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        int n = 15;
        assertFalse(prime.isPrime(n));
    }

    @Test
    public void testIsPrimeWithNumberGreaterThanAndDivisibleBy2() {
        int n = 4;
        assertFalse(prime.isPrime(n));
    }

    @Test
    public void testIsPrimeWithZero() {
        int n = 0;
        assertFalse(prime.isPrime(n));
    }

    @Test
    public void testIsPrimeWithNumberOne() {
        int n = 1;
        assertFalse(prime.isPrime(n));
    }

    @Test
    public void testIsPrimeWithNumberTwo() {
        int n = 2;
        assertTrue(prime.isPrime(n));
    }

    @Test
    public void testIsPrimeWithNegativeNumbers() {
        int n = -17;
        assertThrows(ArithmeticException.class, () -> prime.isPrime(n));
    }

}
