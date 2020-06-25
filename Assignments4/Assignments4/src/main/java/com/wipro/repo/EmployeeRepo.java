package com.wipro.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.pojos.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer>{

}
