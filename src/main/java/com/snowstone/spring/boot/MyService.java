package com.snowstone.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@EnableAutoConfiguration
public class MyService {
	 @Autowired
	  JdbcTemplate jdbcTemplate;
	 public void find(){
		 
		 jdbcTemplate.execute("select * from acms_user");
	 }
	 
}
