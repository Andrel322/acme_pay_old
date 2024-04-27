package com.br.acmpay;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Transaction {
    private long id;

    private LocalDateTime dataTransaction;

    private Account sourceAccount;

    private Account destinationAccount;

    private BigDecimal amount;
}
