package com.techie.dao;

import java.util.List;

import com.techie.model.Employee;

public interface EmployeeDao {
	
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployee(int employeeId);
	public abstract List<Employee> getAllEmployees();
	public abstract void deleteEmployee(int employeeId);
	public abstract void updateEmplyeeEmailById(String email,int employeeId);
	
}
