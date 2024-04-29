package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class WorkerApl {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        List<Worker> workers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the departament's name: ");
        String departamentName = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Level: ");
        String level = scanner.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departamentName));
        System.out.println();
        System.out.print("How many contrats to this worker? ");
        int numberOfContrats = scanner.nextInt();

        for (int i = 1; i <= numberOfContrats; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Date (DD/MM/YYYY): ");
            scanner.nextLine();
            String date = scanner.nextLine();
            Date contractDate = sdf.parse(date);
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration: ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract); // adicionando os contratos do trabalhador
        }

        workers.add(worker);

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getWorkerName());
        System.out.println("Departament: " + worker.getDepartment().getDepartamentName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));

        scanner.close();
    }
}