package com.wellsfargo.counselor.entity;

import com.sun.javafx.beans.IDProperty;

@Entity
public class Security {

    @ID
    @GeneratedValue()
    private long security_id;

    @Column(nullable = false)
    private long portfolio_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int quantity;

    public Security(long security_id, long portfolio_id, String name, int quantity) {
        this.security_id = security_id;
        this.portfolio_id = portfolio_id;
        this.name = name;
        this.quantity = quantity;
    }


    public long getSecurity_id() {
        return security_id;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(long portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
