package com.shaikh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shaikh.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	public List<Employee> findByAddrsAndSal(String addrs, double sal);

	public List<Employee> findBySalGreaterThanEqualOrAddrsIn(double sal, String... cities);

}
