package com.assignQ1.Banks;

public class HBL implements Bank {
    String bName;

    public HBL() {
        this.bName = BankList.HBL.name();
    }

    @Override
    public String getBankName() {
        return bName;
    }
}
