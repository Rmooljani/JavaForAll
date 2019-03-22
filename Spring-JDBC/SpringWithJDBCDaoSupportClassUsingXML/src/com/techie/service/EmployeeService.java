package com.techie.service;

import java.util.List;

import com.techie.model.Employee;

public interface EmployeeService {
	
	public abstract void addEmployee(Employee employee);
	public abstract Employee fetchEmployee(int employeeId);
	public abstract List<Employee> fetchAllEmployees();
	public abstract void removeEmployee(int employeeId);
	public abstract void updateEmplyeeEmailById(String email,int employeeId);

}
