package com.techie.dao.impl;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.techie.dao.EmployeeDao;
import com.techie.model.Employee;

@SuppressWarnings("unused")
@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public void createEmployee(Employee employee) {
		System.out.println("==============using JDBCTemplate ===================");
		String sql = "INSERT INTO employee_table (email,empName,gender,salary) values(?,?,?,?)";
		int update = getJdbcTemplate().update(sql, new Object[] { employee.getEmail(), employee.getEmpName(),
				employee.getGender(), employee.getSalary() });
		if (update > 0) {
			System.out.println("Employee is created....");
		}
	}

	@Override
	public Employee getEmployee(int employeeId) {
		String SQL = "SELECT * FROM employee_table WHERE empId=?";
		Employee employee = (Employee) getJdbcTemplate().queryForObject(SQL, new Object[] { employeeId },
				new EmployeeRowMapper());
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		String SQL = "SELECT * FROM employee_table";
		return getJdbcTemplate().query(SQL, new EmployeeRowMapper());
	}

	@Override
	public void deleteEmployee(int employeeId) {
		String SQL = "SELECT * FROM employee_table WHERE empId=?";
		getJdbcTemplate().queryForObject(SQL, new Object[] { employeeId }, new EmployeeRowMapper());
	}

	@Override
	public void updateEmplyeeEmailById(String email, int employeeId) {
		String SQL = "UPDATE employee_table SET email=? WHERE empId=?";

		Object[] params = { email, employeeId };
		int[] types = { Types.VARCHAR, Types.INTEGER };

		int update = this.getJdbcTemplate().update(SQL, params, types);

		if (update > 0) {
			System.out.println("Employee has been updated...");
		}

	}

}
