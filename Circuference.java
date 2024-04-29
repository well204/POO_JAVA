package classes;

public class Circuference {
    private static final double PI = 3.14159;

    public static double circuference(double radius) {
        double circuference = 2 * PI * radius;
        return circuference;
    }

    public static double volume(double radius) {
        double volume = 4 * PI * Math.pow(radius, 3) / 3;
        return volume;
    }
}
