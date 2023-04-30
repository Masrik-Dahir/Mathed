package org.masrikdahir;

public class Trigonometry {
    public double sec(double angle) {
        double cos = Math.cos(angle);
        if (Math.abs(cos) < 0.000000001){
            throw new ArithmeticException("Double overflowed");
        }
        return 1 / cos;
    }

    public double cosec(double angle) {
        double sin = Math.sin(angle);
        if (Math.abs(sin) < 0.000000001){
            throw new ArithmeticException("Double overflowed");
        }
        return 1 / sin;
    }

    public double cot(double angle) {
        double cot = Math.cos(angle)/Math.sin(angle);
        if (cot == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflowed");
        }
        return cot;
    }
}
