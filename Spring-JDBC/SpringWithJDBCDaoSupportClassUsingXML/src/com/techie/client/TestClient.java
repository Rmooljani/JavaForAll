package com.techie.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Employee;
import com.techie.service.EmployeeService;
import com.techie.service.impl.EmployeeServiceImpl;

public class TestClient {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeServiceImpl.class);
		Employee employee = new Employee();
		employee.setEmpName("Rohana");
		employee.setEmail("ri23er@hmail.com");
		employee.setGender("Female");
		employee.setSalary(76543);

		Employee employee2 = employeeService.fetchEmployee(3);
		System.out.println(employee2.toString());

		List<Employee> empList = employeeService.fetchAllEmployees();
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}

		employeeService.removeEmployee(2);
		System.out.println("Employee deleted " + employee.toString());

		employeeService.updateEmplyeeEmailById("markg876@hmail.com", 3);

		((AbstractApplicationContext) applicationContext).close();

	}

}
