package com.thinh.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        PaymentMethod customerA = new CreditCardPayment(2500, "1234-123-1243");
        customerA.processPayment();
        customerA.printReceipt();

        System.out.println("---------------");

        PaymentMethod customerB = new eWalletPayment(450, "0789-789-9807");
        customerB.processPayment();
        customerB.printReceipt();
    }
}
