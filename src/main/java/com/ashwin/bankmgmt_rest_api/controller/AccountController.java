package com.ashwin.bankmgmt_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.bankmgmt_rest_api.model.Accounts;
import com.ashwin.bankmgmt_rest_api.model.Customer;
import com.ashwin.bankmgmt_rest_api.services.AccountServiceImpl;

@RestController
public class AccountController {

	@Autowired
	private AccountServiceImpl accountServiceImpl;

	public void createAccount(int balance, String acctStatus, Customer customer) {
		Accounts accounts = new Accounts();
		accounts.setBalance(balance);
		accounts.setAcctStatus(acctStatus);
		accounts.setCustomer(customer);
		accountServiceImpl.createAccount(accounts);
	}

	@GetMapping(path = "/getbalance/{acctID}")
	public int getBalance(@PathVariable Integer acctID) {
		return accountServiceImpl.getBalance(acctID);
	}

	@PutMapping(path = "/account/{acctID}/deposit/{amount}")
	public void depositAmount(@PathVariable Integer acctID, @PathVariable Integer amount) {
		accountServiceImpl.depositAmount(acctID, amount);
	}

	@PutMapping(path = "/account/{acctID}/withdraw/{amount}")
	public void withdrawAmount(@PathVariable Integer acctID, @PathVariable Integer amount) {
		accountServiceImpl.withdrawAmount(acctID, amount);
	}

	@PutMapping(path = "/account/{acctID}/transfer/{destAcctID}/amount/{amount}")
	public void transferAmount(@PathVariable int acctID, @PathVariable int destAcctID, @PathVariable int amount) {
		accountServiceImpl.transferAmount(acctID, destAcctID, amount);
	}

	@DeleteMapping(path = "/account/{acctID}")
	public void deleteAccount(@PathVariable int acctID) {
		accountServiceImpl.deleteAccount(acctID);
	}

}