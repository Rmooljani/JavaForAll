package com.techie.info;

import java.util.Map;

import com.techie.model.Student;

public class OrgInfo {
	
	private Map<Integer,String> empAndNamemap;
	private Map<Integer,Student> studentIdMap;
	
	public Map<Integer, String> getEmpAndNamemap() {
		return empAndNamemap;
	}
	public void setEmpAndNamemap(Map<Integer, String> empAndNamemap) {
		this.empAndNamemap = empAndNamemap;
	}
	public Map<Integer, Student> getStudentIdMap() {
		return studentIdMap;
	}
	public void setStudentIdMap(Map<Integer, Student> studentIdMap) {
		this.studentIdMap = studentIdMap;
	}
	
	
	
	

}
