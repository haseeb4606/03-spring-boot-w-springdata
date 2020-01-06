package com.springboot.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

	public CustomerEntity findByNameAndActiveTrue(String name);
	
	
	public List<CustomerEntity> findAll();
}
