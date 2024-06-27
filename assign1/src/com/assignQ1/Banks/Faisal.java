package com.assignQ1.Banks;

public class Faisal implements Bank {
    String bName;

    public Faisal() {
        this.bName = BankList.Faisal.name();
    }

    @Override
    public String getBankName() {
        return bName;
    }
}
