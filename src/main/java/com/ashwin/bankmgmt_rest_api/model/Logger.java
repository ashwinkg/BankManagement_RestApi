package com.ashwin.bankmgmt_rest_api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Logger {
	
	@Id
	private int acctID;
	private String transacType;
	private String transacStatus;
	private int initBal;
	private int finalBal;

}
