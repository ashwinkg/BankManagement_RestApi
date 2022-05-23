package com.ashwin.bankmgmt_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.bankmgmt_rest_api.model.Accounts;
import com.ashwin.bankmgmt_rest_api.model.Customer;
import com.ashwin.bankmgmt_rest_api.model.Logger;
import com.ashwin.bankmgmt_rest_api.services.AccountServiceImpl;

@RestController
public class AccountController {

	@Autowired
	private AccountServiceImpl accountServiceImpl;

	@Autowired
	private LoggerController loggerController;

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
		int initBal = accountServiceImpl.getBalance(acctID);
		accountServiceImpl.depositAmount(acctID, amount);
		Logger logger = new Logger(acctID, "Deposited", "Success", initBal, initBal + amount);
		loggerController.addLog(logger);
	}

	@PutMapping(path = "/account/{acctID}/withdraw/{amount}")
	public void withdrawAmount(@PathVariable Integer acctID, @PathVariable Integer amount) {
		int initBal = accountServiceImpl.getBalance(acctID);
		accountServiceImpl.withdrawAmount(acctID, amount);
		Logger logger = new Logger(acctID, "Withdrawn", "Success", initBal, initBal - amount);
		loggerController.addLog(logger);
	}

	@PutMapping(path = "/account/{acctID}/transfer/{destAcctID}/amount/{amount}")
	public void transferAmount(@PathVariable int acctID, @PathVariable int destAcctID, @PathVariable int amount) {
		int initBalSender = getBalance(acctID);
		int initBalReceiver = getBalance(destAcctID);
		accountServiceImpl.transferAmount(acctID, destAcctID, amount);
		Logger loggerSender = new Logger(acctID, "Transferred", "Success", initBalSender, initBalSender - amount);
		loggerController.addLog(loggerSender);
		Logger loggerReceiver = new Logger(destAcctID, "Received", "Success", initBalReceiver,initBalReceiver + amount);
		loggerController.addLog(loggerReceiver);
	}

	@DeleteMapping(path = "/account/{acctID}")
	public void deleteAccount(@PathVariable int acctID) {
		accountServiceImpl.deleteAccount(acctID);
		loggerController.deleteLog(acctID);
	}

	@GetMapping(path = "/getaccountinfo/{acctID}")
	public Accounts getAccountInfo(@PathVariable int acctID) {
		return accountServiceImpl.getAccountInfo(acctID);
	}

}