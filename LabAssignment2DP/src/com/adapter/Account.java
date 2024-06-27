package com.adapter;

public interface Account {
    double getBalance();
    boolean isOverdraftAvailable();
    void credit(double amount);
}
