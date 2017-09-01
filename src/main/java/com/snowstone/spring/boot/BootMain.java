package com.snowstone.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan({"com.snowstone.spring.boot"})
public class BootMain {

	@Autowired
	MyService myService;
	@Autowired
    private UserRepository userRepository;
	@RequestMapping("/")
	@ResponseBody
	public List<User> home() {
//		myService.find();
		return userRepository.findAll();
	}

	
}
