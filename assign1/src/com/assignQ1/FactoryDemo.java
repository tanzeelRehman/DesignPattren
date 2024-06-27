package com.assignQ1;

import com.assignQ1.Banks.Bank;
import com.assignQ1.Banks.BankList;
import com.assignQ1.FactoryCreator.FactoryCreator;
import com.assignQ1.Loans.Loan;
import com.assignQ1.Loans.LoanList;
import com.assignQ1.abstractFactory.AbstractFactory;

import java.util.Arrays;
import java.util.Scanner;

public class FactoryDemo {
  public static void main(String[] args) {
    AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
    System.out.println("Available Banks = " + Arrays.toString(BankList.values()));

    Scanner scanner = new Scanner(System.in);

    // getting bank from user
    System.out.print("Enter Bank here: ");
    Bank b = null;
    // getting bank from user input and validating the input
    do {
      b = bankFactory.getBank(scanner.next());
      if (b == null) {
        // getting loan from user
        System.out.print("Enter Bank here: ");
      }
    } while (b == null);
    System.out.println("Selected Bank = " + b.getBankName());

    AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
    System.out.println("Available Loans = " + Arrays.toString(LoanList.values()));

    // getting loan from user
    System.out.print("Enter Loan type here: ");
    Loan loan = null;

    // getting loan from loan and validating the input
    do {
      loan = loanFactory.getLoan(scanner.next());
      if (loan == null) {
        // getting loan from user
        System.out.print("Enter Loan type here: ");
      }
    } while (loan == null);

    // getting loan details here
    double rate = 0;
    int years = 0;
    int loanAmount = 0;
    System.out.print("Enter interest rate here (percent): ");
    rate = Math.abs(scanner.nextDouble());

    System.out.print("Enter the loan amount you want to take: ");
    loanAmount = Math.abs(scanner.nextInt());

    System.out.print("Enter the number of years to pay your entire loan amount: ");
    years = Math.abs(scanner.nextInt());

    // getting emi
    System.out.println("you are taking the loan from " + b.getBankName());

    loan.getInterestRate(rate);
    loan.calculateLoanPayment(loanAmount, years);
  }
}
