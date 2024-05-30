package com.wellsfargo.counselor.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class portfolio {
	
	@Id
	@GeneratedValue()
	private long portfolioId;
	
	@Id
	@Column(nullable = false)
	private long clientId;
	
	@Column(nullable = false)
	private Date creationDate;
	
	public portfolio(long clientId, Date creationDate) {
		this.clientId = clientId;
		this.creationDate = creationDate;
		
	}
	
	public long getPortfolioId() {
		return portfolioId;
	}
	
	public long getClientId() {
		return clientId;
	}
	
	public void setClientId(long id) {
		this.clientId = id;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Date date) {
		this.creationDate = date;
	}
}
