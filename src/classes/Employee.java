package classes;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += this.grossSalary * (percentage / 100);
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        String infoEmployee = "Employee: " + this.name + ", $" + String.format("%.2f%n", netSalary());
        return infoEmployee;
    }
}