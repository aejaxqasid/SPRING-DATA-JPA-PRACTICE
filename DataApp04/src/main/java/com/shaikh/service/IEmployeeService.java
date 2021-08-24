package com.shaikh.service;

import java.util.List;

import com.shaikh.views.ResultView;

public interface IEmployeeService {

	public List<ResultView> searchEmployeesBySalGreaterThanEqual(double sal);

}
