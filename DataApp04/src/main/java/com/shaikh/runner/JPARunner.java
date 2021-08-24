package com.shaikh.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.shaikh.service.IEmployeeService;
import com.shaikh.views.ResultView;

@Component
public class JPARunner implements ApplicationRunner {

	@Autowired
	private IEmployeeService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		List<ResultView> list = service.searchEmployeesBySalGreaterThanEqual(26000);
		
		list.forEach(item->{
			//System.out.println(item.getClass()+"---->"+Arrays.toString(item.getClass().getDeclaredMethods()));
			System.out.println("id="+item.getId()+" ,name="+item.getName());
		});
		
	}

}
