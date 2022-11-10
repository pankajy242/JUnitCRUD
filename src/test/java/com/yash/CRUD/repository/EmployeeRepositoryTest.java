package com.yash.CRUD.repository;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.CRUD.service.EmployeeService;



@SpringBootTest
public class EmployeeRepositoryTest {
	
	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks 
	private EmployeeService employeeService;
	
	
}
