package com.assignQ1.Loans;

public abstract class Loan {
  protected double rate;

  public abstract void getInterestRate(double rate);

  public void calculateLoanPayment(int loanAmount, int tenureInYears) {
    double emi;
    int numOfMonth;

    numOfMonth = tenureInYears * 12;
    rate = rate / 1200;
    emi =
        ((rate * Math.pow((1 + rate), numOfMonth)) / ((Math.pow((1 + rate), numOfMonth)) - 1))
            * loanAmount;

    System.out.println("Your monthly EMI is : " + String.format("%.2f",emi) + " for the amount " + loanAmount);
  }


}
