package com.techie.dummy.dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	@Override
	public String toString() {
		return "EmployeeDao [getEmployeesname()=" + getEmployeesname() + ", getEmployeesId()=" + getEmployeesId()
				+ "]";
	}

	public List<String> getEmployeesname() {

		List<String> empList = new ArrayList<>();
		empList.add("Ram");
		empList.add("Shayam");
		return empList;
	}

	public List<Integer> getEmployeesId() {
		List<Integer> empList = new ArrayList<>();
		empList.add(23456);
		empList.add(765432);
		return empList;

	}

}
