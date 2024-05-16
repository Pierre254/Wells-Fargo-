package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToMany(mappedBy = "portfolio")
    private List<Client> clientList;

    @Column(nullable = false)
    private String creationDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "portfolio_security",
            joinColumns = @JoinColumn(name = "security_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "portfolio_id",
                    referencedColumnName = "id"))
        private List<Security> securities;

    public Portfolio(String creationDate, List<Client> clientList, List<Security> securities) {
        this.creationDate = creationDate;
        this.clientList = clientList;
        this.securities = securities;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
