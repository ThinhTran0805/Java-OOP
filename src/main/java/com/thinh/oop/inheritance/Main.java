package com.thinh.oop.inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("BA002", "Peter Packer", 4000, "Java");
        Manager mag = new Manager("PM01", "Jenna Hill", 4200, 500);

        Scanner sc = new Scanner(System.in);
        System.out.println("--EMPLOYEES INFO--");
        System.out.println("Enter total value of project: ");
        int projectValue = sc.nextInt();

        //Developer
        System.out.println("Enter KPI this month of developer: ");
        int kpiDev = sc.nextInt();
        dev.showInfo();
        dev.applyKpiBonus(kpiDev);
        double finalSalary = dev.totalSalary(projectValue, kpiDev);
        System.out.printf("Bonus KPI: %.2f%n",dev.kpiBonus(kpiDev));
        System.out.printf("Bonus project (1%%): %.2f%n", dev.projectBonus(projectValue));
        System.out.printf("Total Salary: %.2f%n", finalSalary);

        //Manager
        System.out.println("Enter KPI this month of manager: ");
        int kpiMag = sc.nextInt();
        mag.showInfo();
        mag.applyKpiBonus(kpiMag);
        double finalSalaryManage = mag.totalSalary(projectValue, kpiMag);
        System.out.printf("Bonus KPI: %.2f%n",mag.kpiBonus(kpiMag));
        System.out.printf("Bonus project (1.2%%): %.2f%n", mag.projectBonus(projectValue));
        System.out.printf("Total Salary: %.2f%n", finalSalaryManage);
    }
}
