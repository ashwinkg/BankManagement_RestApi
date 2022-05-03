package com.ashwin.bankmgmt_rest_api.services;

import com.ashwin.bankmgmt_rest_api.model.Accounts;

public interface AccountService {
	
	public void createAccount(Accounts accounts);
	public Accounts getAccountInfo(int acctID);
	public void deleteAccount(int acctID);
	public int getBalance(int acctID);
	public void depositAmount(int acctID, int amount);
	public void withdrawAmount(int acctID, int amount);
	public void transferAmount(int acctID, int destAcctID, int amount);
}
