package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.CustomerDto;
import com.springboot.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping(value= "", method = RequestMethod.POST)
	public void saveCustomer(@RequestBody CustomerDto dto) {
		
		System.out.println(dto.toString());
		service.saveCustomer(dto);
	}
	
}
