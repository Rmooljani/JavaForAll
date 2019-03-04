package com.techie.model;

public class Employee {
	
	private int empId;
	private String empname;
	private String email;
	private Pancard panNo;

	public Employee(int empId, String empname, String email, Pancard panNo) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.email = email;
		this.panNo = panNo;
	}

	
	public int getEmpId() {
		return empId;
	}


	public String getEmpname() {
		return empname;
	}


	public String getEmail() {
		return email;
	}


	public Pancard getPanNo() {
		return panNo;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", email=" + email + "]";
	}
	
	
	

}
