import org.junit.jupiter.api.Test;
import org.masrikdahir.Statistics;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class TestStatistics {
    private static final double DELTA = 1e-15;

    @Test
    public void testVariance() {
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        Statistics statistics = new Statistics();
        double variance = statistics.variance(data);
        assertEquals(2.5, variance, DELTA);
    }

    @Test
    public void testVarianceEmptyData() {
        double[] data = {};
        Statistics statistics = new Statistics();
        double variance = statistics.variance(data);
        assertEquals(0.0, variance, DELTA);
    }

    @Test
    public void testStandardDeviation() {
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        Statistics statistics = new Statistics();
        double standardDeviation = statistics.standardDeviation(data);
        assertEquals(1.5811388300841898, standardDeviation, DELTA);
    }

    @Test
    public void testStandardDeviationEmptyData() {
        double[] data = {};
        Statistics statistics = new Statistics();
        double standardDeviation = statistics.standardDeviation(data);
        assertEquals(0.0, standardDeviation, DELTA);
    }
}
