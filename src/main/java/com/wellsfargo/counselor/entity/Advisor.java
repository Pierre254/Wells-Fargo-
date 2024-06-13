package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNo;

     @OneToMany(mappedBy = "advisor")
    private Set<Client> clients;


    protected FinancialAdvisor() {

    }

    public FinancialAdvisor(String Name, String phoneNo, String email) {
        this.Name = Name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public String getPhone() {
        return phoneNo;
    }

    public void setPhone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

}
