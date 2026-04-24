package com.thinh.oop.inheritance;

public class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void showInfo () {
        System.out.println("ID: " + id + " | Name: " + name + " | Base Salary: " + baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void applyKpiBonus(int kpi) {
        if (kpi >= 80) {
            System.out.println("Great KPI this month! Your base salary has increased by 8%.");
        }
    }

    public double kpiBonus(int kpi) {
        return (kpi >= 80) ? baseSalary * 0.08 : 0;
    }

    public double totalSalary(int kpi) {
        return baseSalary + kpiBonus(kpi);
    }
}