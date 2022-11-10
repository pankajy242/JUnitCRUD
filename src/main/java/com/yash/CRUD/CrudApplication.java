package com.yash.CRUD;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.yash.CRUD.controller.EmployeeController;
import com.yash.CRUD.repository.EmployeeRepository;
import com.yash.CRUD.service.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {EmployeeController.class, EmployeeService.class, EmployeeRepository.class} )
public class CrudApplication {
	
	
	private static EmployeeRepository employeeRepository =  new EmployeeRepository();
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	

}
