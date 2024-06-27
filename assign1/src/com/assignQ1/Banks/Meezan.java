package com.assignQ1.Banks;

public class Meezan implements Bank {
    String bName;

    public Meezan() {
    this.bName = BankList.Meezan.name();
    }

    @Override
    public String getBankName() {
        return bName;
    }
}
