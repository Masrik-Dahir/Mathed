import org.junit.jupiter.api.Test;
import org.masrikdahir.Trigonometry;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTrigonometry {

    Trigonometry trigonometry = new Trigonometry();

    @Test
    public void testSecPositive() {
        double angle = Math.PI / 4; // 45 degrees
        assertEquals(1.41421356237, trigonometry.sec(angle), 0.00001);
    }

    @Test
    public void testSecNegative() {
        double angle = -Math.PI / 3; // -60 degrees
        assertEquals(2, trigonometry.sec(angle), 0.00001);
    }

    @Test
    public void testSecZero() {
        double angle = 0; // 0 degrees
        assertEquals(1.0, trigonometry.sec(angle), 0.00001);
    }

    @Test
    public void testSec360() {
        double angle = Math.PI*2; // 0 degrees
        assertEquals(1.0, trigonometry.sec(angle), 0.00001);
    }

    @Test
    public void testSec90() {
        double angle = Math.PI/2; // 90 degrees
        assertThrows(ArithmeticException.class, () -> trigonometry.sec(angle));
    }

    @Test
    public void testCosecPositive() {
        double angle = Math.PI / 4; // 45 degrees
        assertEquals(1.41421356237, trigonometry.cosec(angle), 0.00001);
    }

    @Test
    public void testCosecNegative() {
        double angle = -Math.PI / 3; // -60 degrees
        assertEquals(-1.1547005383, trigonometry.cosec(angle), 0.00001);
    }

    @Test
    public void testCosecZero() {
        double angle = 0; // 0 degrees
        assertThrows(ArithmeticException.class, () -> trigonometry.cosec(angle));
    }

    @Test
    public void testCosec360() {
        double angle = Math.PI*2; // 0 degrees
        assertThrows(ArithmeticException.class, () -> trigonometry.cosec(angle));
    }

    @Test
    public void testCosec90() {
        double angle = Math.PI/2; // 90 degrees
        assertEquals(1.0, trigonometry.cosec(angle), 0.00001);
    }

    @Test
    public void testCotPositive() {
        double angle = Math.PI / 4; // 45 degrees
        assertEquals(1.0, trigonometry.cot(angle), 0.00001);
    }

    @Test
    public void testCotNegative() {
        double angle = -Math.PI / 3; // -60 degrees
        assertEquals(-0.577350269, trigonometry.cot(angle), 0.00001);
    }

    @Test
    public void testCotZero() {
        double angle = 0; // 0 degrees
        assertThrows(ArithmeticException.class, () -> trigonometry.cot(angle));
    }

    @Test
    public void testCot90() {
        double angle = Math.PI/2; // 90 degrees
        assertEquals(0, trigonometry.cot(angle), 0.00001);
    }
}
