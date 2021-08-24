package com.shaikh.service;

import java.util.List;

import com.shaikh.entity.Employee;

public interface IEmployeeService {

	public List<Employee> searchEmployeesByAddrsAndSal(String addrs, double sal);

	public List<Employee> searchEmployeesBySalGreaterThanEqualOrAddrsIn(double sal, String... cities);

}
