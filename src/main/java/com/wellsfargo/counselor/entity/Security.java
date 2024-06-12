package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
	
	@Id
	@GeneratedValue()
	private long securityId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int purchasePrice;

	@Column(nullable = false)
	private String purchaseDate;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private int quanity;
	
	@ManyToOne
	private Portfolio portfolio;

	public Security() {
		
	}

	public Security(String name, int purchasePrice, String purchaseDate, int quanity, String category) {
		super();
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quanity = quanity;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public long getSecurityId() {
		return securityId;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
	
	

}
