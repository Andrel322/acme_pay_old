package com.br.acmpay.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaction {
    private long id;

    private LocalDateTime dataTransaction;

    private Account sourceAccount;

    private Account destinationAccount;

    private BigDecimal amount;
}
