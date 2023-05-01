import org.junit.jupiter.api.Test;
import org.masrikdahir.GreatestCommonDenominator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGreatestCommonDenominator {

    GreatestCommonDenominator greatestCommonDenominator = new GreatestCommonDenominator();

    @Test
    public void testGcdWithPositiveNumbers() {
        int num1 = 24;
        int num2 = 18;
        int expectedGcd = 6;
        int actualGcd = greatestCommonDenominator.gcd(num1, num2);
        assertEquals(expectedGcd, actualGcd);
    }

    @Test
    public void testGcdWithNegativeNumber() {
        int num1 = -24;
        int num2 = -18;
        assertThrows(ArithmeticException.class, () -> greatestCommonDenominator.gcd(num1, num2));
    }

    @Test
    public void testGcdWithZeroNumber() {
        int num1 = 0;
        int num2 = 0;
        int expectedGcd = 0;
        int actualGcd = greatestCommonDenominator.gcd(num1, num2);
        assertEquals(expectedGcd, actualGcd);
    }

    @Test
    public void testGcdWithZeroNumberAndPositiveNumber() {
        int num1 = 0;
        int num2 = 5;
        int expectedGcd = 5;
        int actualGcd = greatestCommonDenominator.gcd(num1, num2);
        assertEquals(expectedGcd, actualGcd);
    }

    @Test
    public void testGcdArrayWithPositiveNumbers() {
        int[] numbers = {24, 18, 12, 6};
        int expectedGcd = 6;
        int actualGcd = greatestCommonDenominator.gcd(numbers);
        assertEquals(expectedGcd, actualGcd);
    }

    @Test
    public void testGcdArrayWithMixedNumbers() {
        int[] numbers = {24, -18, 12, 6};
        assertThrows(ArithmeticException.class, () -> greatestCommonDenominator.gcd(numbers));
    }

    @Test
    public void testGcdArrayWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IndexOutOfBoundsException.class, () -> greatestCommonDenominator.gcd(numbers));
    }
}
