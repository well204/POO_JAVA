package application;

import java.util.Locale;
import java.util.Scanner;

import classes.BankAccount;

public class BankApl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double cash = 0;
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter account holder: ");
        String cardHolderName = scanner.nextLine();
        System.out.println("Is there an initial deposit? (y/n)");
        BankAccount account = new BankAccount(accountNumber, cardHolderName);
        char choice = scanner.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Enter initial deposit value: ");
            cash = scanner.nextDouble();
            account.deposit(cash);
        }

        System.out.println(account);
        System.out.println("Enter a deposit value: ");
        cash = scanner.nextDouble();
        account.deposit(cash);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        cash = scanner.nextDouble();
        account.withdraw(cash);
        System.out.println("Updated account data: ");
        System.out.println(account);

        BankAccount account2 = account;
        account2.withdraw(100);
        System.out.println(account);

        scanner.close();
    }
}
