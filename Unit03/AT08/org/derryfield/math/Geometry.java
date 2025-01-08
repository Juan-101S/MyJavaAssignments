package org.derryfield.math;

public class Geometry {
    public static double calcVolSphere(double r) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volume;
    }

    public static double calcSurfSphere(double r) {
        double surface = 4 * Math.PI * Math.pow(r, 2);
        return surface;
    }
}
