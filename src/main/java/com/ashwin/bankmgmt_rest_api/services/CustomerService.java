package com.ashwin.bankmgmt_rest_api.services;

import com.ashwin.bankmgmt_rest_api.model.Customer;

public interface CustomerService {

	public void createCustomer(Customer customer);
	public Customer getCustomerInfo(int acctID);
	public void deleteCustomer(int acctID);
}
