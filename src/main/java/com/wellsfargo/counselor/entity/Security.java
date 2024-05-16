package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToMany(mappedBy = "security")
    private List<Portfolio> portfolios;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseData;

    @Column(nullable = false)
    private String quantity;

    public Security(List<Portfolio> portfolios, String name, String category, String purchasePrice, String purchaseData, String quantity) {
        this.portfolios = portfolios;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseData = purchaseData;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
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

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseData() {
        return purchaseData;
    }

    public void setPurchaseData(String purchaseData) {
        this.purchaseData = purchaseData;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
