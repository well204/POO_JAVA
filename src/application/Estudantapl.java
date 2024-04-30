package application;

import java.util.Locale;
import java.util.Scanner;

import classes.Studant;

public class Estudantapl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Studant studant = new Studant();

        System.out.println("Enter the studant name: ");
        String name = scanner.nextLine();
        studant.setName(name);

        System.out.println("Enter the studant Grade one: ");
        double gradeOne = scanner.nextDouble();
        studant.setGradeOne(gradeOne);

        System.out.println("Enter the studant Grade two: ");
        double gradeTwo = scanner.nextDouble();
        studant.setGradeTwo(gradeTwo);

        System.out.println("Enter the studant Grade three: ");
        double gradeThree = scanner.nextDouble();
        studant.setGradeThree(gradeThree);

        studant.calculateGrade();

        scanner.close();
    }
}
