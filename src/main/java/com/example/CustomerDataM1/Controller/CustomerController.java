package com.example.CustomerDataM1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerDataM1.DTO.CustomerDTO;
import com.example.CustomerDataM1.Entity.Customer;
import com.example.CustomerDataM1.Service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/register")
	public ResponseEntity<Customer> register(@RequestBody CustomerDTO dto) {
		Customer saved = customerService.saveCustomer(dto);
		return ResponseEntity.ok(saved);
	}
}

