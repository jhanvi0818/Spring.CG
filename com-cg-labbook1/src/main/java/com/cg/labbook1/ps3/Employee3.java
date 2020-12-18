package com.cg.labbook1.ps3;



public class Employee3 {
	private int id;
	private String name;
	private double salary;
	
   

//Getter setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	

//Constructors

	public Employee3() {

	}

	public Employee3(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		
	}

	

	public String toString() {

		return "Employee [Employee Id=" +id + " ,Employee Name= " + name + " ,Employee Salary="
				+ salary + " ] ";

	}

	
	
}
