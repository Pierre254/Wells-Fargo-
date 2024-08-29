package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long client_id;

    @Column(nullable = false)
    private long advisor_id;

    @Column(nullable = false)
    private  String name;

    @Column(nullable = false)
    private String contact_info;

    @Column(nullable = false)
    private long portfolio_id;

    public Client(){

    }

    public Client(int client_id, int advisor_id, String name, String contact_info, int portfolio_id) {
        this.client_id = client_id;
        this.advisor_id = advisor_id;
        this.name = name;
        this.contact_info = contact_info;
        this.portfolio_id = portfolio_id;
    }

    public long getClient_id() {
        return client_id;
    }

    public long getAdvisor_id() {
        return advisor_id;
    }

    public void setAdvisor_id(int advisor_id) {
        this.advisor_id = advisor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(int portfolio_id) {
        this.portfolio_id = portfolio_id;
    }


}
