package com.ashwin.bankmgmt_rest_api.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ashwin.bankmgmt_rest_api.model.Customer;
import com.ashwin.bankmgmt_rest_api.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void createCustomer(Customer customer) {
		
		LocalDate randomDate = createRandomDate(1900, 2000);
		customer.setDate_of_birth(randomDate);
		customerRepository.save(customer);
		
	}
	
	public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
	
	public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }
	
	

	@Override
	public Customer getCustomerInfo(int acctID) {
		// TODO Auto-generated method stub
		return customerRepository.findById(acctID).orElse(null);
	}

	@Override
	public void deleteCustomer(int acctID) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(acctID);
	}

}
