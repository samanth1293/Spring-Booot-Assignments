package com.wipro.services;

import java.util.List;

import com.wipro.pojos.Employee;


public interface EmployeeService {
	
	List<Employee> findAll();
	int save(Employee employee);
	Employee findEmployeeById(int id);

}
