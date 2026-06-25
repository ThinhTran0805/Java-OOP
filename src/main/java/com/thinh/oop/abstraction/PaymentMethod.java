package com.thinh.oop.abstraction;

abstract class PaymentMethod {
    //protected field accessible by subclasses
    protected double amount;

    //constructor to initialize the payment amount
    public PaymentMethod (double amount) {
        this.amount = amount;
    }

    //abstract method: No body, must be implemented by concrete subclasses
    public abstract void processPayment();

    //concrete method: Shared functionality across all subclasses
    public void printReceipt() {
        System.out.println("Receipt printed successfully for amount: " + amount + " $");
    }

}
