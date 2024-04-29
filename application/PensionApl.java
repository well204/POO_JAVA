package application;

import java.util.Locale;
import java.util.Scanner;

import classes.Pension;

public class PensionApl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int rooms;
        System.out.print("How many rooms will be rented? ");
        rooms = scanner.nextInt();
        Pension[] pension = new Pension[10];
        System.out.println();

        for (int i = 1; i <= rooms; i++) {
            System.out.println("Rent #" + i);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            System.out.println();
            pension[room] = new Pension(name, email, room);
        }

        System.out.println("Busy rooms:");

        for (int i = 0; i < pension.length; i++) {
            if (pension[i] != null)
                System.out.println(pension[i]);
        }

        scanner.close();
    }
}
