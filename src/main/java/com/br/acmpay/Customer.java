package com.br.acmpay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private long id;

    private String name;

    private String email;

    private String phone;

    private String document;

    private List<Account> accounts;
}
