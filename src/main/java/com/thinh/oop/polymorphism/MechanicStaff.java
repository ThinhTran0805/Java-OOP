package com.thinh.oop.polymorphism;

public class MechanicStaff extends Employee {
    private int repairedCars;

    public MechanicStaff(String name, double baseSalary, int repairedCars) {
        super(name, baseSalary);
        this.repairedCars = repairedCars;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (repairedCars * 28);
    }
}
