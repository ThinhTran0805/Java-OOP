package com.thinh.oop.polymorphism;

public abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name: " + name + " | Salary: " + calculateSalary() + " USD");
    }
}
