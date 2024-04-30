package classes;

import java.lang.Math;

public class Rectangle {
    private double width;
    private double height;

    public double area() {
        return this.height * this.width;
    }

    public double perimeter() {
        return (2 * this.height) + (2 * this.width);
    }

    public double diagonal() {
        double diagonal = 0;
        diagonal = Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
        return diagonal;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        String info = "AREA = " + String.format("%.2f%n", area()) +
                "PERIMETER = " + String.format("%.2f%n", perimeter()) +
                "DIAGONAL = " + String.format("%.2f", diagonal());
        return info;
    }
}
