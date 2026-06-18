package com.thinh.oop.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> shopStaff = new ArrayList<>();

        shopStaff.add(new OfficeStaff("Hanna", 3300, 14));
        shopStaff.add(new MechanicStaff("Bob", 4000, 13));

        System.out.println("---SALARY OF MONTH---");
        for (Employee emp : shopStaff) {
            emp.displayInfo();
        }
    }
}
