package com.adapter;

public class StandardAccount extends AbstractAccount {

    public StandardAccount(double balance) {
        super(balance);
        setOverdraftAvailable(false);
    }
}
