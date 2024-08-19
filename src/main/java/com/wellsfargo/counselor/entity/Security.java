package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Security {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long securityId;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String category;
	@Column(nullable = false)
	private int purchasePrice;
	@Column(nullable = false)
	private Date purchaseDate;
	@Column(nullable = false)
	private int quantity;
	public Security(String name, String category, int purchasePrice, Date purchaseDate, int quantity,Portfolio portfolio) {
		super();
		this.name = name;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quantity = quantity;
		this.portfolio=portfolio;
	}
	@ManyToOne
	private Portfolio portfolio;
	
}
