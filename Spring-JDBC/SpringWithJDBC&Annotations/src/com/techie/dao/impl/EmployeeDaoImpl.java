package com.techie.dao.impl;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techie.dao.EmployeeDao;
import com.techie.model.Employee;

@SuppressWarnings("unused")
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	//private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * public void setDataSource(DataSource dataSource) { this.dataSource =
	 * dataSource; this.jdbcTemplate = new JdbcTemplate(dataSource); }
	 */
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createEmployee(Employee employee) {
		
		System.out.println("==============using JDBC ===================");

		/*
		 * Connection connection = null; PreparedStatement ps = null; try { connection =
		 * dataSource.getConnection(); String sql
		 * ="INSERT INTO employee_table (empName,salary,email,gender) values(?,?,?,?)";
		 * ps = connection.prepareStatement(sql); ps.setString(1,
		 * employee.getEmpName()); ps.setDouble(2, employee.getSalary());
		 * ps.setString(3, employee.getEmail()); ps.setString(4, employee.getGender());
		 * 
		 * int executeUpdate = ps.executeUpdate(); if(executeUpdate>0) {
		 * System.out.println("Employee is created..."); } }catch (SQLException e) {
		 * e.printStackTrace(); }finally { if(connection!=null) { try {
		 * connection.close(); } catch (SQLException e) { e.printStackTrace(); } } }
		 */
		System.out.println("==============using JDBCTemplate ===================");
		String sql = "INSERT INTO employee_table (email,empName,gender,salary) values(?,?,?,?)";
		int update = jdbcTemplate.update(sql, new Object[] { employee.getEmail(), employee.getEmpName(),
				employee.getGender(), employee.getSalary() });
		if (update > 0) {
			System.out.println("Employee is created....");
		}
	}

	@Override
	public Employee getEmployee(int employeeId) {
		String SQL = "SELECT * FROM employee_table WHERE empId=?";
		Employee employee = (Employee) jdbcTemplate.queryForObject(SQL, new Object[] { employeeId },
				new EmployeeRowMapper());
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		String SQL = "SELECT * FROM employee_table";
		return jdbcTemplate.query(SQL, new EmployeeRowMapper());
	}

	@Override
	public void deleteEmployee(int employeeId) {
		String SQL = "SELECT * FROM employee_table WHERE empId=?";
		jdbcTemplate.queryForObject(SQL, new Object[] { employeeId }, new EmployeeRowMapper());
	}

	@Override
	public void updateEmplyeeEmailById(String email, int employeeId) {
		String SQL = "UPDATE employee_table SET email=? WHERE empId=?";

		Object[] params = { email, employeeId };
		int[] types = { Types.VARCHAR, Types.INTEGER };

		int update = this.jdbcTemplate.update(SQL, params, types);

		if (update > 0) {
			System.out.println("Employee has been updated...");
		}

	}

}
