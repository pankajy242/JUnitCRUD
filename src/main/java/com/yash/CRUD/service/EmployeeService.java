package com.yash.CRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.CRUD.entities.Employee;
import com.yash.CRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.getAllEmployee();
	}

	public String createEmployee(Employee emp) {
		return employeeRepository.add(emp);
	}
	
	public String updateEmployee(Employee emp) {
		return employeeRepository.updateEmployee(emp);
	}

	public String deleteEmployee(int empNo) {
		return employeeRepository.delete(empNo);
	}


}
