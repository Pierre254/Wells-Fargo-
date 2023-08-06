package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
interface Securityusage extends Advisor,Portfolio {

    @Id
    @GeneratedValue()
    protected long SecurityId;

    @Column(nullable = false)
    private String Security_Name;

    @Column(nullable = false)
    private String Security_Category;

    @Column(nullable = false)
    private String Security_Purchase_date;

    @Column(nullable = false)
    private String Security_Purchase_price;

    @Column(nullable = false)
    private String Security_Quantity;

    public Long getSecurityId();

    public String getSecurity_Name();

    public void setSecurity_Name(String Security_Name);

    public String getSecurity_Category();

    public void setSecurity_Category(String Security_Category);

    public String getSecurity_Purchase_date();

    public void setSecurity_Purchase_date(String Security_Purchase_date);

    public String getSecurity_Purchase_price();

    public void setSecurity_Purchase_price(String Security_Purchase_price);

    public String getSecurity_Quantity();

    public void setSecurity_Quantity(String Security_Quantity);
}
@Entity
class Security implements Securityusage {
   
    public Long getSecurityId(){
        return SecurityId;
    }

    public String getSecurity_Name(){
        return Security_Name;
    }

    public void setSecurity_Name(String Security_Name){
        this.Customer_firstName = Customer_firstName;
    }

    public String getSecurity_Category(){
        return Security_Category;
    }

    public void setSecurity_Category(String Security_Category){
        this.Security_Category = Security_Category;
    }

    public String getSecurity_Purchase_date(){
        return Security_Purchase_date;
    }

    public void setSecurity_Purchase_date(String Security_Purchase_date){
        this.Security_Purchase_date = Security_Purchase_date;
    }

    public String getSecurity_Purchase_price(){
        return Security_Purchase_pric;
    }

    public void setSecurity_Purchase_price(String Security_Purchase_price){
        this.Security_Purchase_price = Security_Purchase_price;
    }

    public String getSecurity_Quantity(){
        return Security_Quantity;
    }

    public void setSecurity_Quantity(String Security_Quantity){
        this.Security_Quantity = Security_Quantity;
    }
 
}