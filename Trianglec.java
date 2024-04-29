package classes;

import java.lang.Math;

public class Trianglec {
    private double x;
    private double y;
    private double z;

    public Trianglec(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void triangleArea() {
        double p = (getX() + getY() + getZ()) / 2;
        double area = Math.sqrt(p * (p - getX()) * (p - getY()) * (p - getZ()));
        System.out.println("Measure of triangle: " + area);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
