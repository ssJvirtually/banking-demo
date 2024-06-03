package com.ssjvirtually.banking_demo.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Account implements BasicAccountDetails {

    String accountNumber;
    User user;
    BigDecimal balance;
    List<Transaction> transactions;

    AccountType accountType;


    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }
}
