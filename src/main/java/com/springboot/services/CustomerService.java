package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dtos.CustomerDto;
import com.springboot.entities.CustomerEntity;
import com.springboot.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	

	public void saveCustomer(CustomerDto dto) {
		
		CustomerEntity customer = new CustomerEntity();
		
		customer.setName(dto.getName());
		customer.setDomain(dto.getDomain());
		customer.setUrl(dto.getUrl());
		
		repository.save(customer);
				
	}
}
