import org.junit.Test;
import org.masrikdahir.BinaryConversion;
import static org.junit.Assert.*;

public class TestBinaryConversion {

    // Node Coverage
    BinaryConversion binaryConversion = new BinaryConversion();

    @Test
    public void testStringToBinaryWholeNumber() {
        String input = "100";
        String expected = "1100100.0";
        String result = binaryConversion.StringtoBinary(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringToBinaryDecimalNumberRLessThanOne() {
        String input = "3.5";
        String expected = "11.1";
        String result = binaryConversion.StringtoBinary(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringToBinaryDecimalNumberRNotLessThanOne() {
        String input = "1233.52343";
        String expected = "10011010001.10000101111111111000";
        String result = binaryConversion.StringtoBinary(input);
        assertEquals(expected, result);
    }

    @Test
    public void testBinaryStringToDoubleWholeNumber() {
        String input = "1010.0";
        double expected = 10.0;
        double result = binaryConversion.binaryStringToDouble(input);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testBinaryStringToDoubleDecimalNumber() {
        String input = "11.1";
        double expected = 3.5;
        double result = binaryConversion.binaryStringToDouble(input);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testBinaryStringToDoubleZero() {
        String input = "0.0";
        double expected = 0.0;
        double result = binaryConversion.binaryStringToDouble(input);
        assertEquals(expected, result, 0.0);
    }

}
