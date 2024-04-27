package com.br.acmpay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Card {
    private long id;

    private String flag;

    private BigDecimal card_limit;

    private Account cardAccount;
}
