package application;

import java.util.Scanner;

import classes.Conversor;

public class ConversonApl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double ammount = scanner.nextDouble();
        System.out.println(Conversor.conversor(money, ammount));
        scanner.close();
    }

    // public static int wellington(int m, int n) {
    // if (m == 1) return 1;
    // if (m== 2) return n;

    // return wellington(m-1, n) + ((m-1)*n -(m*2-3);
    //     }
}
