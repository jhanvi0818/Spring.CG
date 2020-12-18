package com.cg.labbook1d;

import java.util.List;


public class EmployeeDao {
	
	private List<Employee4> employeeList;
	
	public EmployeeDao(List<Employee4> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public List<Employee4> getEmpList() {
		return employeeList;
	}

	public void setEmpList(List<Employee4> employeeList) {
		this.employeeList = employeeList;
	}
	
	public Employee4 getEmployeeByID(int empid)
	{ 
		Employee4 matchEmployee = employeeList.stream().filter(Employee4-> Employee4.getId() == empid).findFirst().orElse(null);
		return matchEmployee;
		
		
		
	}
	
}
