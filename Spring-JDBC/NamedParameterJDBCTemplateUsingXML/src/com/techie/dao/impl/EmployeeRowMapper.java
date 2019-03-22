package com.techie.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techie.model.Employee;

public class EmployeeRowMapper implements RowMapper {

	@Override
	public Employee mapRow(ResultSet rs, int rownum) throws SQLException {
		
		Employee employee =  new Employee();
		employee.setEmail("email");
		employee.setEmpId(rs.getInt("empId"));
		employee.setEmpName(rs.getString("empName"));
		employee.setGender(rs.getString("gender"));
		employee.setSalary(rs.getInt("salary"));
		return employee;
	}

}
