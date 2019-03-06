package com.techie.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int empId;
	private String empName;
	@Autowired 
	private Pancard pancard;
	
	
	public Employee(int empId, String empName, Pancard pancard) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.pancard = pancard;
	}

	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public Pancard getPancard() {
		return pancard;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", pancard=" + pancard + "]";
	}
	
}
