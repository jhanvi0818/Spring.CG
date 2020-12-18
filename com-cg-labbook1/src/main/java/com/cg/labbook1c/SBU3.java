package com.cg.labbook1c;

import java.util.List;

public class SBU3 {
	int sbuId;
	String sbuName,sbuHead;
	List<Employee3> employeeList;
	public SBU3(int sbuId, String sbuName, String sbuHead, List<Employee3> employeeList) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.employeeList = employeeList;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee3> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee3> employeeList) {
		this.employeeList = employeeList;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
}

