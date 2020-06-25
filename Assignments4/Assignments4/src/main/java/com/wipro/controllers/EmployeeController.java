package com.wipro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.pojos.Employee;
import com.wipro.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping("/displayAll")
	@ResponseBody
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	@PostMapping("/save")
	@ResponseBody
	public List<Employee> save(@ModelAttribute Employee employee) {
		employeeService.save(employee);
		return employeeService.findAll();
	}
	
	@RequestMapping("/display/{id}")
	@ResponseBody
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.findEmployeeById(id);
	}

}
