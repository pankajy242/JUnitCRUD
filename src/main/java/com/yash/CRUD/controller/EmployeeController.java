package com.yash.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.CRUD.entities.Employee;
import com.yash.CRUD.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/callCrud")
	public String callCrud() {
		return "hello crud";
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		List<Employee> list = employeeService.getAllEmployee();
		System.out.println("getAllEmployee==>"+list);
		return list;
		
	}
	
	@PostMapping("/addEmployee")
	public String createEmployee(@RequestBody Employee emp) {
		
		return employeeService.createEmployee(emp);
		
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
		
	}
	
	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam int empNo) {
		return employeeService.deleteEmployee(empNo);
		
	}
}
