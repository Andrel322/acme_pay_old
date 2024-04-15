package com.br.acmpay;

import java.util.List;

public class Customer {
    private String customerDocument;

    private List<Account> costumerAccounts;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    public String getCustomerDocument() {
        return customerDocument;
    }

    public void setCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }

    public List<Account> getCostumerAccounts() {
        return costumerAccounts;
    }

    public void setCostumerAccounts(List<Account> costumerAccounts) {
        this.costumerAccounts = costumerAccounts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
