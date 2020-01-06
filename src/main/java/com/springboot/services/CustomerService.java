package com.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dtos.CustomerDto;
import com.springboot.entities.CustomerEntity;
import com.springboot.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void saveCustomer(CustomerDto dto) {

		CustomerEntity customer = new CustomerEntity();

		customer.setName(dto.getName());
		customer.setDomain(dto.getDomain());
		customer.setUrl(dto.getUrl());

		customerRepository.save(customer);

	}

	// fetching data from customer database

	public CustomerDto convertEntity(CustomerEntity entity) {

		CustomerDto cust = null;

		if (entity != null) {

			cust = new CustomerDto();
		}

		cust.setDomain(entity.getDomain());
		cust.setName(entity.getName());
		cust.setUrl(entity.getUrl());
		cust.setActive(entity.getActive());
		cust.setId(entity.getId());

		return cust;

	}

	public CustomerDto getCustomer(String name) {

		CustomerEntity custom = customerRepository.findByNameAndActiveTrue(name);

		CustomerDto dto = convertEntity(custom);
		return dto;
	}

	public List<CustomerDto> getAllCustomer() {

		List<CustomerEntity> cust = customerRepository.findAll();

		List<CustomerDto> cdto = new ArrayList<CustomerDto>();
		for (CustomerEntity c : cust) {
			CustomerDto temp = convertEntity(c);
			cdto.add(temp);
		}

		return cdto;

	}

}
