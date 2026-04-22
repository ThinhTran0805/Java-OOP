package com.thinh.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccounts myAcc = new BankAccounts(500, "Thinh Tran");

        System.out.println("Account Holder: " + myAcc.getAccountHolder());
        myAcc.deposit(200);
        myAcc.withdraw(1000); // Test over-withdrawal
        myAcc.withdraw(250);  // Test valid withdrawal

        System.out.println("Final balance: " + myAcc.getBalance() + " USD");

        //update account holder name
        if (myAcc.setAccountHolder("Black Jack")) {
            System.out.println("Account holder name updated to: " + myAcc.getAccountHolder());
        } else {
            System.out.println("Error: Invalid name! Please provide a valid name.");
        }
    }
}