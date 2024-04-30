package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Customer extends Advisor {

    @Id
    @GeneratedValue()
    protected long CustomerId;

    @Column(nullable = false)
    private String Customer_firstName;

    @Column(nullable = false)
    private String Customer_lastName;

    @Column(nullable = false)
    private String Customer_address;

    @Column(nullable = false)
    private String Customer_phone;

    @Column(nullable = false)
    private String Customer_email;

    protected Customer() {

    }

    public Customer(long advisorId,String Customer_firstName, String Customer_lastName, String Customer_address, String Customer_phone, String Customer_email) {
        super(advisorId);
        this.Customer_firstName = Customer_firstName;
        this.Customer_lastName = Customer_lastName;
        this.Customer_address = Customer_address;
        this.Customer_phone = Customer_phone;
        this.Customer_email = Customer_email;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public String getCustomer_firstName() {
        return Customer_firstName;
    }

    public void setCustomer_firstName(String Customer_firstName) {
        this.Customer_firstName = Customer_firstName;
    }

    public String getCustomer_lastName() {
        return Customer_lastName;
    }

    public void setCustomer_lastName(String Customer_lastName) {
        this.Customer_lastName = Customer_lastName;
    }

    public String getCustomer_address() {
        return Customer_address;
    }

    public void setCustomer_address(String Customer_address) {
        this.Customer_address = Customer_address;
    }

    public String getCustomer_phone() {
        return Customer_phone;
    }

    public void setCustomer_phone(String Customer_phone) {
        this.Customer_phone = Customer_phone;
    }

    public String getCustomer_email() {
        return Customer_email;
    }

    public void setCustomer_email(String Customer_email) {
        this.Customer_email = Customer_email;
    }
}
