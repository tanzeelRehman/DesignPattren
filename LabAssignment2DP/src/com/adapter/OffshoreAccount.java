package com.adapter;


public class OffshoreAccount {
    private double balance;

    private static final double TAX_RATE = 0.05;

    public OffshoreAccount(final double balance) {
        this.balance = balance;
    }

     double getTaxRate() {
        return TAX_RATE;
    }

     double getOffshoreBalance() {
        return balance;
    }

     void debit(final double debit) {
        if (balance >= debit) {
            balance -= debit;
        }
    }

     void credit(final double credit) {
        balance += balance;
    }
}