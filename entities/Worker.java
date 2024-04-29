package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String workerName;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public String getWorkerName() {
        return workerName;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Worker() {
    }

    public Worker(String workerName, WorkerLevel level, Double baseSalary, Department department) {
        this.workerName = workerName;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract c : contracts) {
            calendar.setTime(c.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_month = 1 + calendar.get(Calendar.MONTH); // o mês do Calendar começa com 0
            if (c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
