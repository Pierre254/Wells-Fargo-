package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private Long security_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portifolio_id")
    private Portifolio portifolio;

    public Security() {
    }

    public Security(Portifolio portifolio, String name, String category, Date purchaseDate, BigDecimal purchasePrice, int quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portifolio = portifolio;
    }

    public Long getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(Long security_id) {
        this.security_id = security_id;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portifolio getPortifolio() {
        return portifolio;
    }

    public void setPortifolio(Portifolio portifolio) {
        this.portifolio = portifolio;
    }
}
