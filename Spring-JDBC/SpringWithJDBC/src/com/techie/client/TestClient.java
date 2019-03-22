package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Employee;
import com.techie.service.EmployeeService;
import com.techie.service.impl.EmployeeServiceImpl;

public class TestClient {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeServiceImpl.class);
		createEmployee(employeeService);
		applicationContext.close();
	}
	
	private static void createEmployee(EmployeeService employeeService) {
		Employee employee = new Employee();
		employee.setEmpName("Fiona");
		employee.setEmail("fiona@hmail.com");
		employee.setGender("Female");
		employee.setSalary(8762245);

		employeeService.addEmployee(employee);
	}

}
