package com.ashwin.bankmgmt_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BankManagementRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankManagementRestApiApplication.class, args);
			
	}
}
