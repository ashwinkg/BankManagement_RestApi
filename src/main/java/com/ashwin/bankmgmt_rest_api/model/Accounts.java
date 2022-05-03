package com.ashwin.bankmgmt_rest_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acctID;
	private int balance;
	private String acctStatus;
}
