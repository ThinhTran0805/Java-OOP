package com.thinh.oop.polymorphism;

public class OfficeStaff extends Employee {
    private int overtimeHours;

    public OfficeStaff(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * 50);
    }
}
