package com.wellsfargo.counselor.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolio_id;

    @Column(nullable = false)
    private long client_id;

    public Portfolio(long portfolio_id, long client_id) {
        this.portfolio_id = portfolio_id;
        this.client_id = client_id;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }



}
