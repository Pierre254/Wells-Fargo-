package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    protected long advisorId;

    @Column(nullable = false)
    private String Advisor_firstName;

    @Column(nullable = false)
    private String Advisor_lastName;

    @Column(nullable = false)
    private String Advisor_address;

    @Column(nullable = false)
    private String Advisor_phone;

    @Column(nullable = false)
    private String Advisor_email;

    protected Advisor() {

    }

    public Advisor(String Advisor_firstName, String Advisor_lastName, String Advisor_address, String Advisor_phone, String Advisor_email) {
        this.Advisor_firstName = Advisor_firstName;
        this.Advisor_lastName = Advisor_lastName;
        this.Advisor_address = Advisor_address;
        this.Advisor_phone = Advisor_phone;
        this.Advisor_email = Advisor_email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getAdvisor_FirstName() {
        return Advisor_firstName;
    }

    public void setAdvisor_FirstName(String Advisor_firstName) {
        this.Advisor_firstName = Advisor_firstName;
    }

    public String getAdvisor_LastName() {
        return Advisor_lastName;
    }

    public void setAdvisor_LastName(String Advisor_lastName) {
        this.Advisor_lastName = Advisor_lastName;
    }

    public String getAdvisor_Address() {
        return Advisor_address;
    }

    public void setAdvisor_Address(String Advisor_address) {
        this.Advisor_address = Advisor_address;
    }

    public String getAdvisor_Phone() {
        return Advisor_phone;
    }

    public void setAdvisor_Phone(String Advisor_phone) {
        this.phone = phone;
    }

    public String getAdvisor_Email() {
        return Advisor_email;
    }

    public void setAdvisor_Email(String Advisor_email) {
        this.Advisor_email = Advisor_email;
    }
}
