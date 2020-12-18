package com.cg.labbook1b;



public class Employee2 {
	private int id;
	private String name;
	private double salary;
	
    private SBU businessUnit ;
    public SBU getSbu() {
		return sbu;
	}

	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}

	private SBU sbu;

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

	
	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

//Constructors

	public Employee2() {

	}

	public Employee2(int id, String ame, double salary, SBU businessUnit) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		this.businessUnit = businessUnit;
	}

	public SBU getSbuDetails() {
		toString();
		sbu.toString();
		
		return sbu;
	}

	public String toString() {

		return "Employee [Employee Id=" +id + " ,Employee Name= " + name + " ,Employee Salary="
				+ salary + "] ";

	}

	
	
}
