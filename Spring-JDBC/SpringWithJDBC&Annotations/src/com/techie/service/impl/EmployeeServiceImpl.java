package com.techie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techie.dao.EmployeeDao;
import com.techie.model.Employee;
import com.techie.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.createEmployee(employee);
	}

	@Override
	public Employee fetchEmployee(int employeeId) {
		return employeeDao.getEmployee(employeeId);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public void removeEmployee(int employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public void updateEmplyeeEmailById(String email, int employeeId) {
		employeeDao.updateEmplyeeEmailById(email, employeeId);
	}

}
