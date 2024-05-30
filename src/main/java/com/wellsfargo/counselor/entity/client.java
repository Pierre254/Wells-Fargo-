package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class client {
	
	@Id
	@GeneratedValue()
	private long clientId;
	
	@Id
	@Column(nullable = false)
	@OneToMany
	private long advisorId;
	
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
	
	public client(long advisorId, String firstName, String lastName, String address, String email, String phone ) {
		this.advisorId = advisorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	
	}
	
	public long getClientId() {
		return clientId;
	}
	
	public long getAdvisorId() {
		return advisorId;
		
	}
	
	public void setAdvisorId(long id) {
		this.advisorId = id;
	}
	
	public String getFirstName() {
		return firstName;
		
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String name) {
		this.lastName=name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public String getEmail() {
		return email;
		
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
	public String getPhone() {
		return phone;
		
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
