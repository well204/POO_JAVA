package application;

import java.util.Locale;
import java.util.Scanner;

import classes.Rectangle;

public class Rectangleapl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Enter the rectangle width and height: ");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Rectangle a = new Rectangle();
        a.setHeight(height);
        a.setWidth(width);
        System.out.println(a.toString());

        sc.close();
    }
}
