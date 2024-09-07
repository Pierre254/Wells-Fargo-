package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Portifolio {
    @Id
    @GeneratedValue
    private Long portifolio_id;

    @Column(nullable = false)
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portifolio")
    private List<Security> securities;

    public Portifolio() {
    }

    public Portifolio(Client client, Date creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortifolio_id() {
        return portifolio_id;
    }

    public void setPortifolio_id(Long portifolio_id) {
        this.portifolio_id = portifolio_id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
