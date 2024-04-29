package classes;

public class Conversor {
    private static final double IOF = 1.06;

    public static double conversor(double ammount, double money) {
        double value = ammount * money * IOF;
        return value;
    }
}
