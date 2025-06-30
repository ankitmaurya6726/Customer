package com.example.CustomerDataM1.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerDataM1.Config.MailClient;
import com.example.CustomerDataM1.DTO.CustomerDTO;
import com.example.CustomerDataM1.Entity.Customer;
import com.example.CustomerDataM1.Repository.CustomerRepository;

@Service
public class CustomerService {


	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	 private MailClient mailClient;

	public Customer saveCustomer(CustomerDTO dto) {

		Customer cust = new Customer();
		cust.setFullName(dto.getFullName());
		cust.setEmail(dto.getEmail());
		cust.setCity(dto.getCity());
		cust.setPhone(cust.getPhone());

		Customer saved = customerRepo.save(cust);
		
		  // Call MailService
        Map<String, Object> payload = new HashMap<>();
        payload.put("email", saved.getEmail());
        payload.put("customerId", saved.getId());
        payload.put("name", saved.getFullName());

        mailClient.sendMail(payload);
        
		return saved;

	}
}
