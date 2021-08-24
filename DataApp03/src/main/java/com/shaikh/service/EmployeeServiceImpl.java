package com.shaikh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaikh.entity.Employee;
import com.shaikh.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public List<Employee> searchEmployeesByAddrsAndSal(String addrs, double sal) {

		return repo.findByAddrsAndSal(addrs, sal);
	}

	@Override
	public List<Employee> searchEmployeesBySalGreaterThanEqualOrAddrsIn(double sal, String... cities) {

		return repo.findBySalGreaterThanEqualOrAddrsIn(sal, cities);
	}

}
