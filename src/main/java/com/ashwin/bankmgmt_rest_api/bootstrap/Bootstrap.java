package com.ashwin.bankmgmt_rest_api.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashwin.bankmgmt_rest_api.model.Customer;
import com.ashwin.bankmgmt_rest_api.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class Bootstrap implements CommandLineRunner {

	CustomerRepository customerRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer();
		customer1.setName("Ashwin");
		customer1.setEmail("ashwin@gmail.com");
		customer1.setCity("Chicago");
		customer1.setState("Illinois");
		customer1.setCountry("USA");
		customer1.setPhoneNo(1234567);
		customer1.setPassword("ashwin");
		customer1.setDate_of_birth(LocalDate.now());
		customerRepository.save(customer1);
		
		
		Customer customer2 = new Customer();
		customer2.setName("Ashwin");
		customer2.setEmail("ashwin@gmail.com");
		customer2.setCity("Chicago");
		customer2.setState("Illinois");
		customer2.setCountry("USA");
		customer2.setPhoneNo(1234567);
		customer2.setPassword("ashwin");
		customer2.setDate_of_birth(LocalDate.now());
		customerRepository.save(customer2);
		
		
		Customer customer3 = new Customer();
		customer3.setName("Ashwin");
		customer3.setEmail("ashwin@gmail.com");
		customer3.setCity("Chicago");
		customer3.setState("Illinois");
		customer3.setCountry("USA");
		customer3.setPhoneNo(1234567);
		customer3.setPassword("ashwin");
		customer3.setDate_of_birth(LocalDate.now());
		customerRepository.save(customer3);
		
		
		Customer customer4 = new Customer();
		customer4.setName("Ashwin");
		customer4.setEmail("ashwin@gmail.com");
		customer4.setCity("Chicago");
		customer4.setState("Illinois");
		customer4.setCountry("USA");
		customer4.setPhoneNo(1234567);
		customer4.setPassword("ashwin");
		customer4.setDate_of_birth(LocalDate.now());
		customerRepository.save(customer4);
		
	}

	
	
}
