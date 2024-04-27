package com.br.acmpay.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private long id;

    private String flag;

    private BigDecimal card_limit;

    private Account cardAccount;
}
