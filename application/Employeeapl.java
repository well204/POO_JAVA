package application;

import java.util.Locale;
import java.util.Scanner;

import classes.Employee;

public class Employeeapl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee name: ");
        String name = sc.nextLine();

        System.out.println("Enter the employee salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter the tax: ");
        double tax = sc.nextDouble();

        Employee e = new Employee();
        e.setGrossSalary(salary);
        e.setName(name);
        e.setTax(tax);

        System.out.println(e.toString());

        System.out.println("Which percentage to increase salary?");
        double increase = sc.nextDouble();
        e.increaseSalary(increase);

        System.out.println("Updated data: " + e.toString());

        sc.close();
    }
}
