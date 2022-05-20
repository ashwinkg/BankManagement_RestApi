package com.ashwin.bankmgmt_rest_api.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.IllegalTransactionStateException;

import com.ashwin.bankmgmt_rest_api.model.Accounts;
import com.ashwin.bankmgmt_rest_api.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void createAccount(Accounts accounts) {
		// TODO Auto-generated method stub
		accountRepository.save(accounts);
	}

	@Override
	public Accounts getAccountInfo(int acctID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(int acctID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBalance(int acctID) {
		// TODO Auto-generated method stub
		return accountRepository.findBalanceByAcctID(acctID);
	}

	@Override
	public void depositAmount(int acctID, int amount) {
		// TODO Auto-generated method stub
		int balance = accountRepository.findBalanceByAcctID(acctID);
		int new_balance = balance + amount;
		accountRepository.updateBalanceByAcctID(acctID, new_balance);
	}

	@Override
	public void withdrawAmount(int acctID, int amount) {
		// TODO Auto-generated method stub
		int balance = accountRepository.findBalanceByAcctID(acctID);
		int new_balance = balance - amount;
		accountRepository.updateBalanceByAcctID(acctID, new_balance);
	}

	@Override
	public void transferAmount(int acctID, int destAcctID, int amount) {
		// TODO Auto-generated method stub
		
	}

}
