package com.yash.CRUD.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.CRUD.entities.Employee;
import com.yash.CRUD.service.EmployeeService;

@SpringBootTest
public class EmployeeControllerTest {
	
	    @InjectMocks
	    private EmployeeController employeeController;
	    
	    @Mock
	    private EmployeeService employeeService;
	    
	    public void setup() {
	        MockitoAnnotations.initMocks(this);
	    }
	    
	    @Test
	    public void  getAllEmployeeTest() {
	    	ArrayList<Employee> empList = new ArrayList<>();
	    	empList.add(new Employee(999, "User99","HelloTest1",4344344344L));
	    	empList.add(new Employee(346, "User097","Test32",5437237483L));
	    	when(employeeController.getAllEmployee()).thenReturn(empList);
	    }
	    @Test
	    public void createEmployee() throws Exception {
	    	Employee emp =new Employee(999, "User99","HelloTest1",4344344344L);
	    	when(employeeController.createEmployee(emp)).thenReturn("Created Sucessfully");
	    }
	    
	    @Test
	    public void deleteEmployee() throws Exception{
	    	when(employeeController.deleteEmployee(002)).thenReturn("Deleted Successfully");
	    }
	    
	    @Test
	    public void updateEmployee() throws Exception{
	    	Employee emp =new Employee(654, "User007","WorldTest1",9874563267L);
	    	when(employeeController.updateEmployee(emp)).thenReturn("Updated Successfully");
	    }
	    
}
