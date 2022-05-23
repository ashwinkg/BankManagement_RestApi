package com.ashwin.bankmgmt_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.bankmgmt_rest_api.model.Logger;
import com.ashwin.bankmgmt_rest_api.services.LoggerServiceImpl;

@RestController
public class LoggerController {

	@Autowired
	public LoggerServiceImpl loggerServiceImpl;
	
	
	public void addLog(Logger logger)
	{
		loggerServiceImpl.addLog(logger);
	}
	
	public void deleteLog(int acctID) {
		loggerServiceImpl.deleteLog(acctID);
	}
	
	@GetMapping("/account/{acctID}/logs")
	public Logger showLog(@PathVariable int acctID) {
		return loggerServiceImpl.showLog(acctID);
	}
}
