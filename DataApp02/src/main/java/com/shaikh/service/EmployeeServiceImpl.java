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
	public String saveEmplyee(Employee emp) {
		Employee res = repo.save(emp);
		return res != null ? "success :: " + res.getId() : "failure";
	}

	@Override
	public Employee getEmployeeById(int id) {

		return repo.getById(id);
	}

	@Override
	public String deleteEmployeesByIds(List<Integer> ids) {
		List<Employee> list = repo.findAllById(ids);
		if (list.size() != 0) {
			repo.deleteAllByIdInBatch(ids);
			return list.size() + " records delete";
		}
		return "no record found for deletion";
	}

	@Override
	public List<Employee> fetchEmployeesBySal(double sal) {

		return repo.findBySal(sal);
		// return repo.findBySalEquals(sal);
		// return repo.findBySalIs(sal);
	}

	@Override
	public List<Employee> fetchEmployeesBySalAndAddrs(double sal, String addrs) {
		return repo.findBySalAndAddrs(sal, addrs);
	}

	@Override
	public List<Employee> fetchEmployeesBySalOrAddrs(double sal, String addrs) {
		return repo.findBySalOrAddrs(sal, addrs);
	}

	@Override
	public List<Employee> fetchAllEmployeeSalBetween(double sal1, double sal2) {
		return repo.findBySalBetween(sal1, sal2);
	}

	@Override
	public List<Employee> fetchEmployeesBySalLt(double sal) {
		return repo.findBySalLessThan(sal);
	}

	@Override
	public List<Employee> fetchEmployeesBySalLte(double sal) {
		return repo.findBySalLessThanEqual(sal);
	}

	@Override
	public List<Employee> fetchEmployeesBySalGt(double sal) {
		return repo.findBySalGreaterThan(sal);
	}

	@Override
	public List<Employee> fetchEmployeesBySalGte(double sal) {
		return repo.findBySalGreaterThanEqual(sal);
	}

	@Override
	public List<Employee> fetchEmployeesByAddrsIn(String... cities) {
		return repo.findByAddrsIn(cities);
	}

	@Override
	public List<Employee> fetchEmployeesByNameStw(String pattern) {
		return repo.findByNameStartingWith(pattern);
	}

	@Override
	public List<Employee> fetchEmployeesByNameEw(String pattern) {
		return repo.findByNameEndingWith(pattern);
	}

	@Override
	public List<Employee> fetchEmployeesBySalOrderByName(double sal) {
		return repo.findBySalOrderByNameDesc(sal);
	}

}
