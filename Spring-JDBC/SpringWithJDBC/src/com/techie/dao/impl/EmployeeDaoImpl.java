package com.techie.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.techie.dao.EmployeeDao;
import com.techie.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private HibernateDaoSupport hibernateTemplate;

	public HibernateDaoSupport getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateDaoSupport hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void createEmployee(Employee employee) {
      hibernateTemplate.getHibernateTemplate().save(employee);		
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmplyeeEmailById(String email, int employeeId) {
		// TODO Auto-generated method stub
		
	}
	
	
}
