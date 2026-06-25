package com.thinh.oop.abstraction;

//contrete subclass for Credit Card transaction
class CreditCardPayment extends PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    //overriding the abstract method to provide specific credit card logic
    @Override
    public void processPayment() {
        System.out.println("Connecting to Bank Gateway... Verifying card: " + cardNumber);
        System.out.println("Successfully charged $" + amount + " via Credit Card.");
    }
}

//concrete subclass for E-Wallet (e.g., PayPal, MoMo) transactions
class eWalletPayment extends PaymentMethod {
    private String phoneNumber;

    public eWalletPayment(double amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    //overriding the abstract method to provide specific e-wallet logic
    @Override
    public void processPayment() {
        System.out.println("Generating QR Code for account linked to: " + phoneNumber);
        System.out.println("Successfully deducted $" + amount + " from E-Wallet.");
    }
}