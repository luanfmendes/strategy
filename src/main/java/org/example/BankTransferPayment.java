package org.example;

public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer: " + accountNumber);
    }
}
