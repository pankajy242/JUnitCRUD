package com.yash.CRUD.service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.CRUD.entities.Employee;
import com.yash.CRUD.repository.EmployeeRepository;

@SpringBootTest
public class EmployeeServiceTest {
	
	@InjectMocks
	private EmployeeService employeeService;
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	public void setup() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
    public void  getAllEmployeeTest() {
    	ArrayList<Employee> empList = new ArrayList<>();
    	empList.add(new Employee(999, "User99","HelloTest1",4344344344L));
    	empList.add(new Employee(346, "User097","Test32",5437237483L));
    	when(employeeService.getAllEmployee()).thenReturn(empList);
    }
    @Test
    public void createEmployee() throws Exception {
    	Employee emp =new Employee(999, "User99","HelloTest1",4344344344L);
    	when(employeeService.createEmployee(emp)).thenReturn("Created Sucessfully");
    }
    
    @Test
    public void deleteEmployee() throws Exception{
    	when(employeeService.deleteEmployee(002)).thenReturn("Deleted Successfully");
    }
    
    @Test
    public void updateEmployee() throws Exception{
    	Employee emp =new Employee(654, "User007","WorldTest1",9874563267L);
    	when(employeeService.updateEmployee(emp)).thenReturn("Updated Successfully");
    }
	

}
