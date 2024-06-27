package com.assignQ1.abstractFactory;

import com.assignQ1.Banks.Bank;
import com.assignQ1.Loans.Loan;

public abstract class AbstractFactory {
  public abstract Bank getBank(String bankName);

  public abstract Loan getLoan(String loan);
}
