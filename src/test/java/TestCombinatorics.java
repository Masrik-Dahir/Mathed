import org.junit.jupiter.api.Test;
import org.masrikdahir.Combinatorics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCombinatorics {

    Combinatorics combinatorics = new Combinatorics();

    @Test
    public void testPermutation() {
        int n = 5;
        int r = 3;
        assertEquals(60, combinatorics.permutation(n, r), 0.00001);
    }

    @Test
    public void testPermutationWithZeroValues() {
        int n = 0;
        int r = 0;
        assertEquals(1, combinatorics.permutation(n, r), 0.00001);
    }

    @Test
    public void testPermutationWithRGreaterThanN() {
        int n = 4;
        int r = 12;
        assertThrows(ArithmeticException.class, () -> combinatorics.permutation(n, r));
    }

    @Test
    public void testPermutationWithNegativeValues() {
        int n = -5;
        int r = -3;
        assertThrows(ArithmeticException.class, () -> combinatorics.permutation(n, r));
    }

    @Test
    public void testCombination() {
        int n = 5;
        int r = 3;
        assertEquals(10, combinatorics.combination(n, r), 0.00001);
    }

    @Test
    public void testCombinationWithZeroValues() {
        int n = 0;
        int r = 0;
        assertEquals(1, combinatorics.combination(n, r), 0.00001);
    }

    @Test
    public void testCombinationWithRGreaterThanN() {
        int n = 4;
        int r = 12;
        assertThrows(ArithmeticException.class, () -> combinatorics.combination(n, r));
    }

    @Test
    public void testCombinationWithNegativeValues() {
        int n = -5;
        int r = -3;
        assertThrows(ArithmeticException.class, () -> combinatorics.combination(n, r));
    }

    @Test
    public void testFactorial() {
        int n = 5;
        assertEquals(120, combinatorics.factorial(n), 0.00001);
    }

    @Test
    public void testFactorialWithZeroValues() {
        int n = 0;
        assertEquals(1, combinatorics.factorial(n), 0.00001);
    }

    @Test
    public void testFactorialWithNegativeValues() {
        int n = -5;
        assertThrows(ArithmeticException.class, () -> combinatorics.factorial(n));
    }
}
