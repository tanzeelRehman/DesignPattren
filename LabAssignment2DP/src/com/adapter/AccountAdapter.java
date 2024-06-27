package com.adapter;


public class AccountAdapter extends AbstractAccount {


    private OffshoreAccount offshoreAccount;

    public AccountAdapter( OffshoreAccount offshoreAccount) {
        super(offshoreAccount.getOffshoreBalance());
        this.offshoreAccount = offshoreAccount;
    }

    @Override
    public double getBalance() {
         double taxRate = offshoreAccount.getTaxRate();
         double grossBalance = offshoreAccount.getOffshoreBalance();

         double taxableBalance = grossBalance * taxRate;
         double balanceAfterTax = grossBalance - taxableBalance;
        return balanceAfterTax;
    }
}