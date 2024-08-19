package com.wellsfargo.counselor.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clientId;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "client")
	private Portfolio portfolio;

	public Client(String firstName, String lastName, String address, String phone, String email, Portfolio portfolio) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.portfolio = portfolio;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
