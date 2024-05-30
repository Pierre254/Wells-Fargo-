package com.wellsfargo.counselor.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class security {
	
	@Id
	@GeneratedValue()
	private long securityId;
	
	@Id
	@Column(nullable = false)
	@OneToMany
	private long portfolioId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private double purchasePrice;
	
	@Column(nullable = false)
	private Date purchaseDate;
	
	@Column(nullable = false)
	private int quantity;
	
	public security(long portfolioId, String name, String category, double purchasePrice, Date purchaseDate, int quantity) {
		this.portfolioId = portfolioId;
		this.name = name;
		this.category = category;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	
	}
	
	public long getSecurityId() {
		return securityId;
		
	}
	
	public long getPortfolioId() {
		return portfolioId;
	}
	
	public void setPortfolioId(long id) {
		this.portfolioId = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String c) {
		this.category = c;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int q) {
		this.quantity = q;
		
	}
	
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setDate(Date p) {
		this.purchaseDate = p;
	}
	
	public double getPurchasePrice() {
		return purchasePrice;
	}
	
	public void setPurchasePrice(float p) {
		this.purchasePrice = p;
	}
	
	
	
	

}
