package com.cg.labbook1d;

public class Employee4 {
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

	public Employee4() {

	}

	public Employee4(int id, String name, double salary) {
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
