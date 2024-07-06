package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioId;

    @ManyToOne
    private Client clientId;

    @Column(nullable = false)
    private Date creationDate;

    public Portfolio() {

    }

    public Portfolio(Client clientId, Date creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
