package com.assignQ1.Loans;

public class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double homeLoanRate) {
        rate=homeLoanRate;
    }
}
