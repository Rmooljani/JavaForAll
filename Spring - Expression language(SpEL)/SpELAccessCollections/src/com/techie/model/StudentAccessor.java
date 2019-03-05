package com.techie.model;

import java.util.List;

public class StudentAccessor {
	
	private Student thirdStudentInList;
	private List<Student> failedStudents;
	private List<Student> passedStudents;
	
	public List<Student> getPassedStudents() {
		return passedStudents;
	}
	public void setPassedStudents(List<Student> passedStudents) {
		this.passedStudents = passedStudents;
	}
	private List<String> studentNames;
	public Student getThirdStudentInList() {
		return thirdStudentInList;
	}
	public void setThirdStudentInList(Student thirdStudentInList) {
		this.thirdStudentInList = thirdStudentInList;
	}
	public List<Student> getFailedStudents() {
		return failedStudents;
	}
	public void setFailedStudents(List<Student> failedStudents) {
		this.failedStudents = failedStudents;
	}
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	@Override
	public String toString() {
		return "StudentAccessor [thirdStudentInList=" + thirdStudentInList + ", failedStudents=" + failedStudents
				+ ", studentNames=" + studentNames + "]";
	}
	
	

}
