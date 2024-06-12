package com.wellsfargo.counselor.entity;

import java.awt.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	@GeneratedValue()
	private long clientId;
	
	@ManyToOne
	private Advisor advisor;
	
	@OneToMany
	private List porfolios;
	
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

	public Client(String firstName, String lastName, String address, String phone,
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	public List getPorfolios() {
		return porfolios;
	}

	public void setPorfolios(List porfolios) {
		this.porfolios = porfolios;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getClientId() {
		return clientId;
	}
	
	

}
