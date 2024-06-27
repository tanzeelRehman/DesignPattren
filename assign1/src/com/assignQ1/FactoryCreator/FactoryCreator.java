package com.assignQ1.FactoryCreator;

import com.assignQ1.abstractFactory.AbstractFactory;
import com.assignQ1.abstractFactory.BankFactory;
import com.assignQ1.abstractFactory.LoanFactory;

public class FactoryCreator {
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("Bank")) {
      return new BankFactory();
    } else if (choice.equalsIgnoreCase("Loan")) {
      return new LoanFactory();
    }
    return null;
  }
}
