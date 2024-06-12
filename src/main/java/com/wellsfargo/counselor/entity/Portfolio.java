package com.wellsfargo.counselor.entity;

import java.awt.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Portfolio {
	
	@OneToMany
	private List security;

	@ManyToOne
	private Client client;
	
	@Id
	@GeneratedValue()
	private long portfolioId;
	
	@Column(nullable = false)
	private String dateCreated;

	public Portfolio() {
		// TODO Auto-generated constructor stub
	}

	public Portfolio(String dateCreated) {
		super();
		this.dateCreated = dateCreated;
	}

	public List getSecurity() {
		return security;
	}

	public void setSecurity(List security) {
		this.security = security;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public long getPortfolioId() {
		return portfolioId;
	}
	
	

}
