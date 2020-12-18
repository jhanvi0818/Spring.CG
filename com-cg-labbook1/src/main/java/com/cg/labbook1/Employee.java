package com.cg.labbook1;



public class Employee {
	int id;
	String name,bu;
	int age;
	double salary;
	 public Employee() { 
	        System.out.println("-------------------------------"); 
	    }
	
	public Employee(int id, String name, double salary, String bu, int age)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bu = bu;
		this.age = age;
	}

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

	public String getBu() {
		return bu;
	}

	public void setBu(String bu) {
		this.bu = bu;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Details\n Employee ID =" + id + "\n Employee name=" + name + "\n Employee salary=" + salary+ "\n Employee BU=" + bu + "\n Employee age=" + age;
	}

	
	
}
