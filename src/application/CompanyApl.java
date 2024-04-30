package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import classes.Company;

public class CompanyApl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Company> company = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 1; i <= numberOfEmployees; i++) {
            boolean idExists = false;

            System.out.println("Employee #" + i);
            System.out.print("ID: ");
            int id = scanner.nextInt();
            for (Company e : company) {
                if (e.getEmployeeId() == id) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                System.err.println("ID: " + id + " já cadastrado!");
                continue;
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            Company newCompany = new Company(id, name, salary);
            company.add(newCompany);

            System.out.println();
        }

        System.out.print("Enter the employee id that will be have salary increase: ");
        int id = scanner.nextInt();

        Company foundEmployee = company.stream()
                .filter(x -> x.getEmployeeId() == id)
                .findFirst()
                .orElse(null);

        if (foundEmployee != null) {
            System.out.print("Enter the percentage: ");
            double increase = scanner.nextDouble();

            foundEmployee.incrementSalary(increase);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Company e : company)
            System.out.println(e);

        scanner.close();
    }
}
