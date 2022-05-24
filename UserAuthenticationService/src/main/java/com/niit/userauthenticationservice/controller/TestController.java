package com.niit.userauthenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.userauthenticationservice.model.User;

@RestController
public class TestController {
	@Autowired
    Environment environment;
 
	@RequestMapping(value = "/saveUser", method = RequestMethod.GET)
	public User firstPage() {

		User user = new User();
		user.setEmail("aa@gmail.com");
		user.setPassword("pass@123");
		String serverPort = environment.getProperty("local.server.port");
		 
        System.out.println("Port : " + serverPort);
		return user;
	}

}
