package com.assignQ1.Banks;

public class UBL implements Bank {
    String bName;

    public UBL() {
    this.bName = BankList.UBL.name();
    }

    @Override
    public String getBankName() {
        return bName;
    }
}
