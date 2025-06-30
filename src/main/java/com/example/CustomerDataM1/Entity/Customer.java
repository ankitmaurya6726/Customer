package com.example.CustomerDataM1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String FullName;
	private String email;
	private String Phone;
	private String City;
	public Customer(Long id, String fullName, String email, String phone, String city) {
		super();
		this.id = id;
		FullName = fullName;
		this.email = email;
		Phone = phone;
		City = city;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}


}
