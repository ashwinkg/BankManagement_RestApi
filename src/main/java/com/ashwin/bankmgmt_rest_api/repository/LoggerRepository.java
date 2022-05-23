package com.ashwin.bankmgmt_rest_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.bankmgmt_rest_api.model.Logger;

@Repository
public interface LoggerRepository extends CrudRepository<Logger, Integer> {

}
