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
	
		/*
		 * Employee emp = new Employee(null, "shaikh", 60000.0, "Akola");
		 * System.out.println(service.saveEmplyee(emp));
		 */
		
		//System.out.println(service.getEmployeeById(6203));
		
		//System.out.println(service.deleteEmployeesByIds(List.of(6202,6203,6204,6205)));
		
		//service.fetchEmployeesBySal(23000.0).forEach(System.out::println);
		
		//service.fetchEmployeesBySalAndAddrs(25000.0, "patur").forEach(System.out::println);
		
		//service.fetchEmployeesBySalOrAddrs(25000.0, "patur").forEach(System.out::println);
		
		//service.fetchAllEmployeeSalBetween(26000, 35000).forEach(System.out::println);
		
		//service.fetchEmployeesBySalLt(25000).forEach(System.out::println);
		
		//service.fetchEmployeesBySalLte(25000).forEach(System.out::println);
		
		//service.fetchEmployeesBySalGt(25000).forEach(System.out::println);
		
		//service.fetchEmployeesBySalGte(25000).forEach(System.out::println);
		
		service.fetchEmployeesByNameStw("a").forEach(System.out::println);
		
		//service.fetchEmployeesByNameEw("r").forEach(System.out::println);
		
		//service.fetchEmployeesBySalOrderByName(25000).forEach(System.out::println);
		
		//service.fetchEmployeesByAddrsIn("patur", "mumbai", "hyd", "akola").forEach(System.out::println);
		
	}

}
