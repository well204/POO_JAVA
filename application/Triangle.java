package application;

import java.util.Scanner;

import classes.Trianglec;

import java.lang.Math;

public class Triangle {
    public static void main(String[] args) {
        double xa, xb, xc;
        double ya, yb, yc;
        Scanner sc = new Scanner(System.in);
        Trianglec a = new Trianglec(7.5, 4.5, 4.02);
        a.triangleArea();
        System.out.println("Enter the measures for the triangle X: ");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();

        System.out.println("Enter the measures for the triangle Y: ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double p1 = (xa + xb + xc) / 2;
        double p2 = (ya + yb + yc) / 2;
        double area1 = Math.sqrt(p1 * (p1 - xa) * (p1 - xb) * (p1 - xc));
        double area2 = Math.sqrt(p2 * (p2 - ya) * (p2 - yb) * (p2 - yc));

        System.out.println("Measures of X: " + area1);
        System.out.println("Measures of Y: " + area2);

        sc.close();
    }
}
