package edu.realemj.exercises09;

public class MathUtil {
    public static boolean isDoubleEqual(double a,
                                        double b) {
        final double EPS = 1e-10;
        return (Math.abs(a - b) <= EPS);
    }
}
