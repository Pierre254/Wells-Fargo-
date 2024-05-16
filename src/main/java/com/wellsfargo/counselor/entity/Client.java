package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name="advisor_id")
    private Advisor advisors;


    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "client_portfolio",
            joinColumns = @JoinColumn(name = "portfolio_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "client_id",
                    referencedColumnName = "id"))
    private List<Portfolio> portfolios;

    public Client(Advisor advisors, String firstName, String lastName, String address, List<Portfolio> portfolios) {
        this.advisors = advisors;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.portfolios = portfolios;
    }

    public long getClientId() {
        return clientId;
    }

    public Advisor getAdvisors() {
        return advisors;
    }

    public void setAdvisors(Advisor advisors) {
        this.advisors = advisors;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
