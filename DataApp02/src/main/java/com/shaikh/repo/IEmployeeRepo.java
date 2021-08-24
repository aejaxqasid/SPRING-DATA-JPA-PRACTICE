package com.shaikh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shaikh.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL = ?
	public List<Employee> findBySal(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL = ? AND ADDRS = ?
	public List<Employee> findBySalAndAddrs(double sal, String addrs);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL = ? OR ADDRS = ?
	public List<Employee> findBySalOrAddrs(double sal,String addrs);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL = ?
	public List<Employee> findBySalIs(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL = ?
	public List<Employee> findBySalEquals(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL  BETWEEN ? AND ?
	public List<Employee> findBySalBetween(double sal1, double sal2);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL < ?
	public List<Employee> findBySalLessThan(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL <= ?
	public List<Employee> findBySalLessThanEqual(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL > ?
	public List<Employee> findBySalGreaterThan(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL >= ?
	public List<Employee> findBySalGreaterThanEqual(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE NAME LIKE ? ESCAPE ?
	public List<Employee> findByNameStartingWith(String pattern);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE NAME LIKE ? ESCAPE ?
	public List<Employee> findByNameEndingWith(String pattern);
	
	//SELECT ID,NAME,SAL,ADDRS FROM EMPLOYEE WHERE SAL >= ? ORDER BY NAME DESC
	public List<Employee> findBySalOrderByNameDesc(double sal);
	
	//SELECT ID,NAME,SAL,ADDRS, FROM EMPLOYEE WHERE ADDRS IN(...)
	public List<Employee> findByAddrsIn(String... cities);

}
