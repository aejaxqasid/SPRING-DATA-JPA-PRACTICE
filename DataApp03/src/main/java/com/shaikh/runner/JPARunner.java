package com.shaikh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.shaikh.service.IEmployeeService;

@Component
public class JPARunner implements ApplicationRunner {

	@Autowired
	private IEmployeeService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		//service.searchEmployeesByAddrsAndSal("patur", 25000).forEach(System.out::println);
		
		service.searchEmployeesBySalGreaterThanEqualOrAddrsIn(27000, "akola","patur").forEach(System.out::println);
	}

}
