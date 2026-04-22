package com.thinh.oop.encapsulation;

public class BankAccounts {
    // 1. Encapsulation: Hide balance from direct access
    private double balance;
    private String accountHolder;

    public BankAccounts(double initialBalance, String accountHolder) {
        this.balance = (initialBalance > 0) ? initialBalance : 0;
        this.accountHolder = accountHolder;
    }

    // Get account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Get current balance (Read-only)
    public double getBalance() {
        return balance;
    }

    //Setter: Update name with validation
    public boolean setAccountHolder(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.accountHolder = newName;
            return true;
        } else {
            return false;
        }
    }

    // Deposit money with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + " USD for " + accountHolder);
        }
    }

    // Withdraw money with conditions
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + " USD. Remaining balance: " + balance + " USD.");
        } else {
            System.out.println("Insufficient funds or invalid amount. Please check again!");
        }
    }
}