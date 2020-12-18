package com.cg.labbook1.problemstatement5.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table
public class Employee {

 	@Id
 	@Column
 	private int eid;
 	@Column
 	private String name;
 	@Column
 	private double salary;
 
 	public int getEid() {
       	return eid;
 	}
 
 	public void setEid(int eid) {
       	this.eid = eid;
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
 	
 
}
 
