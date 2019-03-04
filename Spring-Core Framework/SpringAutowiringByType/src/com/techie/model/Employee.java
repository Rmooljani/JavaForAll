package com.techie.model;

public class Employee {
	
	private int empId;
	private String empname;
	private String email;
	private Pancard panNo;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Pancard getPanNo() {
		return panNo;
	}
	public void setPanNo(Pancard panNo) {
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", email=" + email + "]";
	}
	
	
	

}
