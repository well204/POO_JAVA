package classes;

public class Company {
    private Integer employeeId;
    private String employeeName;
    private Double employeeSalary;

    public Company(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public void incrementSalary(double percentage) {
        this.employeeSalary += this.employeeSalary * (percentage / 100);
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        String employeeDataInfo = this.employeeId + ", " + this.employeeName +
                ", $" + String.format("%.2f", this.employeeSalary);
        return employeeDataInfo;
    }
}
