package com.yash.CRUD.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.yash.CRUD.entities.Employee;

@Repository
public class EmployeeRepository {
	
public List<Employee> list = new ArrayList<Employee>(Arrays.asList(
			new Employee(001, "User1","helloworld1",9876543210L),
			new Employee(002, "User2","helloworld2",9876546575L),
			new Employee(003, "User3","helloworld3",9876543250L)
		));



public EmployeeRepository() {
	super();
	// TODO Auto-generated constructor stub
}

public List<Employee> getAllEmployee() {
	return list;
}

public String add(Employee emp) {
	list.add(emp);
	return "Successfully Created";
}

public String updateEmployee(Employee emp) {
	List<Employee> l = list.stream().filter(e-> (e.getEmpId() == emp.getEmpId())).collect(Collectors.toList());;
	if(l.size()>0) {
		l.forEach(e->{
			e.setPhone(emp.getPhone());
			e.setPassword(emp.getPassword());
			e.setUserName(emp.getUserName());
			
		});
		return "Successfully Updated";	
	}else {
		return "Employee not found!";
	}
	
}

public String delete(int empNo) {
	List<Employee> l = list.stream().filter(e-> (e.getEmpId() == empNo)).collect(Collectors.toList());;
	if(l.size()>0) {
		list.removeAll(l);
		return "Deleted Successfully";	
	}else {
		return "Employee not found!";
	}
}
}
