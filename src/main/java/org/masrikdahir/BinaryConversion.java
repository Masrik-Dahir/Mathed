package org.masrikdahir;
import java.math.BigInteger;

public class BinaryConversion {
    public String StringtoBinary(String str) {
        long d;
        double fraction = .0;
        if (str.contains(".")){
            String[] lon = str.split("\\.");
            d = Long.parseUnsignedLong(lon[0]);
            fraction = Double.parseDouble("0."+lon[1]);

        }
        else{
            d = Long.parseUnsignedLong(str);
            fraction = .0;
        }

        long wholePart = (long) d;
        int precision = 20;
        String first = wholeToBinary(wholePart);
        String second = fractionalToBinary(fraction, precision);

        if (second.equals("")){
            second = "0";
        }
        return first + "." + second;
    }

    private static String wholeToBinary(long l) {
        return Long.toBinaryString(l);
    }

    private static String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

    public double binaryStringToDouble(String s) {
        return stringToDouble(s, 2);
    }

    public static double stringToDouble(String s, int base) {
        String withoutPeriod = s.replace(".", "");
        double value = new BigInteger(withoutPeriod, base).doubleValue();
        String binaryDivisor = "1" + s.split("\\.")[1].replace("1", "0");
        double divisor = new BigInteger(binaryDivisor, base).doubleValue();
        return value / divisor;
    }

}
