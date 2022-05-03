package com.ashwin.bankmgmt_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashwin.bankmgmt_rest_api.model.Accounts;

public interface AccountRepository extends CrudRepository<Accounts, Integer>,JpaRepository<Accounts, Integer> {

	@Query("select balance from Accounts where acctID = ?1")
	public int findBalanceByAcctID(int acctID);
}
