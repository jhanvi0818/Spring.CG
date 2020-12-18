package com.cg.labbook1.problemstatement5.service;


 
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.labbook1.problemstatement5.employee.Employee;
import com.cg.labbook1.problemstatement5.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
 	EmployeeRepository employeeRepository;
 
	public List<Employee> getAllEmployee() {
		System.out.println("getAllEmployee");
       	List<Employee> employee = new ArrayList<Employee>();
       	employeeRepository.findAll().forEach(employee1 -> employee.add(employee1));
       	return employee;
 	}
 
	public Employee getEmployeeById(int id) {
		System.out.println("getEmployeeById");
       	return employeeRepository.findById(id).get();
 	}
 
}


