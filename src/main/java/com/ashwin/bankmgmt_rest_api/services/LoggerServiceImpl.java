package com.ashwin.bankmgmt_rest_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.bankmgmt_rest_api.repository.LoggerRepository;
import com.ashwin.bankmgmt_rest_api.model.Logger;

@Service
public class LoggerServiceImpl implements LoggerService {

	@Autowired
	LoggerRepository loggerRepository;

	public LoggerServiceImpl(LoggerRepository loggerRepository) {
		this.loggerRepository = loggerRepository;
	}

	public void addLog(Logger logger) {
		loggerRepository.save(logger);
	}

	public void deleteLog(int acctID) {
		loggerRepository.deleteById(acctID);
	}
	
	public Logger showLog(int acctID) {
		return loggerRepository.findById(acctID).orElse(null);
	}
}
