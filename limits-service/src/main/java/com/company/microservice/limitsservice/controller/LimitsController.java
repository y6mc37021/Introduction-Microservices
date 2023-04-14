package com.company.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.microservice.limitsservice.configuration.Configuration;
import com.company.microservice.limitsservice.controller.bean.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	 
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
