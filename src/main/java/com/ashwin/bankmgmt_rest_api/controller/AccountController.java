package com.ashwin.bankmgmt_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.bankmgmt_rest_api.model.Accounts;
import com.ashwin.bankmgmt_rest_api.model.Customer;
import com.ashwin.bankmgmt_rest_api.services.AccountServiceImpl;

@RestController
public class AccountController {

	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	public void createAccount(int balance, String acctStatus,Customer customer )
	{
		Accounts accounts = new Accounts();
		accounts.setBalance(balance);
		accounts.setAcctStatus(acctStatus);
		accounts.setCustomer(customer);
		accountServiceImpl.createAccount(accounts);
	}
	
}