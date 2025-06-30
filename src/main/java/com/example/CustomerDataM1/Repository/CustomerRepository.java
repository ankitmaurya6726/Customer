package com.example.CustomerDataM1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CustomerDataM1.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	
	

}
