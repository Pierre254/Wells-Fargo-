package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Id
    @OneToMany
    private long clientId;

    @Column
    private String creationDate;

    public Portfolio(String creationDate){
        this.creationDate = creationDate;

    }

}
