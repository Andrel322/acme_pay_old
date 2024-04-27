package com.br.acmpay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Account {
    private long id;

    private String number;

    private String agency;

    private BigDecimal balance;

    private Customer customer;
}
