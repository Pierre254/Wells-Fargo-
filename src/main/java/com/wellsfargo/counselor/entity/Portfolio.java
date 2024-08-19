package com.wellsfargo.counselor.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Portfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long portfolioId;
	
	@CreationTimestamp
	private Date creationDate;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clientId",referencedColumnName = "clientId")
	private Client client;


	
	
	public Portfolio(Date creationDate, Client client, List<Security> securities) {
		super();
		this.creationDate = creationDate;
		this.client = client;
		this.securities = securities;
	}




	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "portfolioId",referencedColumnName = "portfolioId")
	List<Security> securities=new ArrayList<Security>();
	
	
	
	
}
