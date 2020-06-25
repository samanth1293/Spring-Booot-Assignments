package com.wipro.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	Map<Integer, Employee> employees=new HashMap<>();
	
	public EmployeeController() {
		employees.put(10, new Employee(10, "samanth", "samanth.1293@gmail.com", "Hyderabad"));
	}
	
	@GetMapping("/displayAll")
	public List<Employee> getAllEmployee(){
		
		return new ArrayList<Employee>(employees.values());
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employees.get(id);
	}
	
	@PostMapping(value="/save")
	public String save(@RequestBody Employee employee) {
		employees.put(employee.getId(),employee);
		return"Inserted Sucessfully";
	}
	
	@PutMapping(value="/update")
	public String update(@RequestBody Employee employee) {
		employees.put(employee.getId(),employee);
		return "Inserted/Updated Sucessfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		if(employees.containsKey(id)) {
			employees.remove(id);
			return "Deleted the unwanted employee record";
		}else {
			return "There is no employee assiocated with employee id";
		}
	}
	
}
