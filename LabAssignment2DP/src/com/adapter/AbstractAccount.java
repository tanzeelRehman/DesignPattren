package com.adapter;

public class AbstractAccount implements Account {
    private double balance;
    private boolean isOverdraftAvailable;

    public AbstractAccount( double amount) {
        this.balance = amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean isOverdraftAvailable() {
        return isOverdraftAvailable;
    }

    public void setOverdraftAvailable(boolean isOverdraftAvailable) {
        this.isOverdraftAvailable = isOverdraftAvailable;
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "balance=" + balance +
                ", isOverdraftAvailable=" + isOverdraftAvailable +
                '}';
    }

    @Override
    public void credit(final double credit) {
        balance += credit;
    }
}
