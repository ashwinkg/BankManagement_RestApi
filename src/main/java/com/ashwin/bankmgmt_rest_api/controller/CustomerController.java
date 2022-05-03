package com.ashwin.bankmgmt_rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.bankmgmt_rest_api.model.Customer;
import com.ashwin.bankmgmt_rest_api.services.CustomerServiceImpl;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	CustomerServiceImpl customerServiceImpl;
	
	public CustomerController(CustomerServiceImpl customerServiceImpl) {
		this.customerServiceImpl = customerServiceImpl;
	}

	@PostMapping
	public void createCustomer(@RequestBody Customer customer)
	{   
		
		customerServiceImpl.createCustomer(customer);
	}

	@GetMapping(value  = "/{acctID}")
	public ResponseEntity<Customer> getCustomerInfo(@PathVariable Integer acctID)
	{
		Customer customer= customerServiceImpl.getCustomerInfo(acctID);
		HttpStatus status = HttpStatus.OK;
		if(customer==null)
		{
			status = HttpStatus.NOT_FOUND;
		}
		
		return ResponseEntity.status(status).body(customer);
	}
	
	
}
