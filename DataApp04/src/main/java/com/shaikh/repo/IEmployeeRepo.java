package com.shaikh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shaikh.entity.Employee;
import com.shaikh.views.ResultView;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	public List<ResultView> findBySalGreaterThanEqual(double sal);

}
