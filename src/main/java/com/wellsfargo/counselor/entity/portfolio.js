package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Asset> assets;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    // Constructors, getters, and setters

    public Portfolio() {
    }

    public Portfolio(Client client, List<Asset> assets) {
        this.client = client;
        this.assets = assets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
