package com.ashwin.bankmgmt_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ashwin.bankmgmt_rest_api.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	
	
	
	
}
