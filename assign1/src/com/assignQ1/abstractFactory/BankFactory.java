package com.assignQ1.abstractFactory;

import com.assignQ1.Banks.*;
import com.assignQ1.Loans.Loan;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
    if (bankName == null) {
        return null;
    }
    if (bankName.equalsIgnoreCase(BankList.HBL.name())){
        return new HBL();
    }else if (bankName.equalsIgnoreCase(BankList.Faisal.name())){
        return new Faisal();
    }else if (bankName.equalsIgnoreCase(BankList.UBL.name())){
        return new UBL();
    }else if (bankName.equalsIgnoreCase(BankList.Meezan.name())){
        return new Meezan();
    }
    return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
