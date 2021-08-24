package com.shaikh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaikh.repo.IEmployeeRepo;
import com.shaikh.views.ResultView;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public List<ResultView> searchEmployeesBySalGreaterThanEqual(double sal) {
		
		return repo.findBySalGreaterThanEqual(sal);
	}


}
