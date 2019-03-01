package com.techie.info;

import java.util.List;
import java.util.Set;

import com.techie.model.Student;

public class OrgInfo {
	
	private Student[] namesArr = new Student[2];
	private Set<Student> studentSet;
	private List<Student> studentList;
	
	public Student[] getNamesArr() {
		return namesArr;
	}
	public void setNamesArr(Student[] namesArr) {
		this.namesArr = namesArr;
	}
	public Set<Student> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	

}
