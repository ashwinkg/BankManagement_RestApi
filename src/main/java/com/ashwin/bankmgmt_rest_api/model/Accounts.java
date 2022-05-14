package com.ashwin.bankmgmt_rest_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acctID;
	private int balance;
	private String acctStatus;
	
	@OneToOne
	private Customer customer;
}
