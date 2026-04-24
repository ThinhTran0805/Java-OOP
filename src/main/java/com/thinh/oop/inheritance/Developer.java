package com.thinh.oop.inheritance;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String id, String name, double baseSalary, String programmingLanguage) {
        super(id, name, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Coding using " + programmingLanguage + " language.");
    }

    @Override
    public void applyKpiBonus(int kpi) {
        super.applyKpiBonus(kpi);

        if (kpi >= 80) {
            System.out.println("Developer bonus: You got 1% project bonus!");
        }
    }

    public double projectBonus(double projectValue) {
        return projectValue * 0.01;
    }
    public double totalSalary(double projectValue, int kpi) {
        return getBaseSalary() + projectBonus(projectValue) + kpiBonus(kpi);
    }
}
