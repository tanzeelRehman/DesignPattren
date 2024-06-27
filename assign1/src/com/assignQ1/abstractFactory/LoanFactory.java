package com.assignQ1.abstractFactory;

import com.assignQ1.Banks.*;
import com.assignQ1.Loans.*;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
    if (loan == null) {
        return null;
    }
        if (loan.equalsIgnoreCase(LoanList.HomeLoan.name())){
            return new HomeLoan();
        }else if (loan.equalsIgnoreCase(LoanList.BussinessLoan.name())){
            return new BussinessLoan();
        }else if (loan.equalsIgnoreCase(LoanList.EducationLoan.name())){
            return new EducationLoan();
        }
        return null;
    }
}
