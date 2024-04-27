package com.br.acmpay.domain;

import com.br.acmpay.exceptions.BalanceWithdrawException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
    private long id;

    private String number;

    private String agency;

    private BigDecimal balance;

    private Customer customer;

    private List<Card> cards;

    private List<Transaction> transactions;

    private LocalDateTime createData;

    private LocalDateTime updateData;

    public void deposit(BigDecimal amount) {
        this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws BalanceWithdrawException {
        if (this.balance.compareTo(amount) >= 0) {
            this.balance.subtract(amount);
        } else {
            throw new BalanceWithdrawException("Error withdraw");
        }
    }

    public Transaction createTransaction(BigDecimal amount, Account destinationAccount) throws BalanceWithdrawException {
        if (this.balance.compareTo(amount) >= 0) {
            Transaction transaction = Transaction.builder().sourceAccount(this).amount(amount).destinationAccount(destinationAccount).dataTransaction(LocalDateTime.now()).build();

            this.balance.subtract(amount);
            destinationAccount.deposit(amount);
            transactions.add(transaction);

            return transaction;
        } else {
            throw new BalanceWithdrawException("Error withdraw");
        }
    }
}