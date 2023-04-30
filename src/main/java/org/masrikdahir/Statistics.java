package org.masrikdahir;

public class Statistics {
    public double variance(double[] data) {
        double mean = 0.0;
        double sum = 0.0;

        for (int i = 0; i < data.length; i++) {
            mean += data[i];
        }
        mean /= data.length;

        for (int i = 0; i < data.length; i++) {
            sum += (data[i] - mean) * (data[i] - mean);
        }

        return sum / (data.length - 1);
    }

    public double standardDeviation(double[] data) {
        Statistics Statistics = new Statistics();
        double variance = Statistics.variance(data);

        return Math.sqrt(variance);
    }
}
