package application;

import java.util.Locale;
import java.util.Scanner;

import classes.Circuference;

public class CircunferenceApl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        System.out.println("Volume: " + Circuference.volume(radius));
        System.out.println("Circunference: " + Circuference.circuference(radius));

        scanner.close();
    }
}
