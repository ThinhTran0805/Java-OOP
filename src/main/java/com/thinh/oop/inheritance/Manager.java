package com.thinh.oop.inheritance;

public class Manager extends Employee{

    private double manageBonus;

    public Manager(String id, String name, double baseSalary) {
        super(id, name, baseSalary);
        this.manageBonus = manageBonus;
    }

    public Manager(String id, String name, double baseSalary, double manageBonus) {
        super(id, name, baseSalary);
        this.manageBonus = manageBonus;
    }

    public void showInfo() {
        super.showInfo();
        double total = getBaseSalary() + manageBonus;
        System.out.println("Total salary for manager position is: " + total);
    }

    @Override
    public void applyKpiBonus(int kpi) {
        super.applyKpiBonus(kpi);

        if (kpi >= 80) {
            System.out.println("Manager bonus: You got 1.2% project bonus!");
        }
    }

    public double projectBonus (double projectValue) {
        return projectValue * 0.012;
    }

    public double totalSalary(double projectValue, int kpi) {
        return getBaseSalary() + projectBonus(projectValue) + kpiBonus(kpi) + manageBonus;
    }
}
