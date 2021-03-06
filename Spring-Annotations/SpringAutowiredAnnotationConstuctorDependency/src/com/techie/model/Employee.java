package com.techie.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int empId;
	private String empName;
	@Autowired 
	private Pancard pancard;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Pancard getPancard() {
		return pancard;
	}
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", pancard=" + pancard + "]";
	}
	
}
