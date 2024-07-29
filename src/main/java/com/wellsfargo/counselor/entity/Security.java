package com.wellsfargo.counselor.entity;

import com.sun.jdi.event.StepEvent;
import jakarta.persistence.*;

@Entity
public class Security {



    @Id
    @GeneratedValue
    private long securityId;

    @OneToMany
    private long portfolioId;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private long purchasePrice;

    @Column
    private String purchaseDate;

    @Column
    private long quantity;

    public long getSecurityId() {
        return securityId;
    }


    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }



    public Security(String name, String category, long purchasePrice, String purchaseDate, long quantity){
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }
}
