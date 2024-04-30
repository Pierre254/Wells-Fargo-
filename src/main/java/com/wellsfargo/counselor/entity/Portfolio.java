package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Portfolio extends Customer {

    @Id
    @GeneratedValue()
    protected long PortfolioId;

    protected Portfolio() {

    }

    public Portfolio(long CustomerId) {
        super(CustomerId);
    }

    public Long getPortfolioId() {
        return PortfolioId;
    }
}
