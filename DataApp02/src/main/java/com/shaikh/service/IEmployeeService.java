package com.shaikh.service;

import java.util.List;

import com.shaikh.entity.Employee;

public interface IEmployeeService {
	
	public String saveEmplyee(Employee emp);
	
	public Employee getEmployeeById(int id);
	
	public String deleteEmployeesByIds(List<Integer> ids);
	
	public List<Employee> fetchEmployeesBySal(double sal);
	
	public List<Employee> fetchEmployeesBySalAndAddrs(double sal, String addrs);
	
	public List<Employee> fetchEmployeesBySalOrAddrs(double sal, String addrs);
	
	public List<Employee> fetchAllEmployeeSalBetween(double sal1, double sal2);
	
	public List<Employee> fetchEmployeesBySalLt(double sal);
	
	public List<Employee> fetchEmployeesBySalLte(double sal);
	
	public List<Employee> fetchEmployeesBySalGt(double sal);
	
	public List<Employee> fetchEmployeesBySalGte(double sal);
	
	public List<Employee> fetchEmployeesByNameStw(String pattern);
	
	public List<Employee> fetchEmployeesByNameEw(String pattern);
	
	public List<Employee> fetchEmployeesBySalOrderByName(double sal);
	
	public List<Employee> fetchEmployeesByAddrsIn(String... cities);
		

}
