package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.CustomerEntity;



@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long>{

}
