package com.wipro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.pojos.Employee;
import com.wipro.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo  employeeRepo;

	@Override
	public List<Employee> findAll() {
		
		return (List<Employee>) employeeRepo.findAll();
	}

	@Override
	public int save(Employee employee) {
		
		return employeeRepo.save(employee).getId();
	}

	@Override
	public Employee findEmployeeById(int id) {
		
		return employeeRepo.findById(id).get();
	}

}
