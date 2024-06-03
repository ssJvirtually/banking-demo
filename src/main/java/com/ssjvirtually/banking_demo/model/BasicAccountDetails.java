package com.ssjvirtually.banking_demo.model;


import java.math.BigDecimal;
import java.util.List;

public interface BasicAccountDetails {


    String getAccountNumber();
    User getUser();
    BigDecimal getBalance();

    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);

    List<Transaction> getTransactions();


    AccountType getAccountType();

}
