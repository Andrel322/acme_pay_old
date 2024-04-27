package com.br.acmpay.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private long id;

    private String name;

    private String email;

    private String phone;

    private String document;

    private List<Account> accounts;
}
