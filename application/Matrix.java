package application;

import java.util.Scanner;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[line][column];
        Random random = new Random();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        showMatrix(matrix);
        int x = scanner.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (x == matrix[i][j]) {
                    if (i == 0 && j < column - 1) {
                        System.out.println("Position: " + i + "," + j);
                        System.out.println("Left: " + matrix[i][j - 1]);
                        System.out.println("Right: " + matrix[i][j + 1]);
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    if (i > 0 && j > 0 && j < column - 1) {
                        System.out.println("Position: " + i + "," + j);
                        System.out.println("Left: " + matrix[i][j - 1]);
                        System.out.println("Right: " + matrix[i][j + 1]);
                        System.out.println("Up: " + matrix[i - 1][j]);
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    if (i > 0 && j == 0) {
                        System.out.println("Position: " + i + "," + j);
                        System.out.println("Right: " + matrix[i][j + 1]);
                        System.out.println("Up: " + matrix[i - 1][j]);
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    if (i > 0 && j == column - 1) {
                        System.out.println("Position: " + i + "," + j);
                        System.out.println("Left: " + matrix[i][j - 1]);
                        System.out.println("Up: " + matrix[i - 1][j]);
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    if (i == 0 && j == column - 1) {
                        System.out.println("Position: " + i + "," + j);
                        System.out.println("Left: " + matrix[i][j - 1]);
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        scanner.close();
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
