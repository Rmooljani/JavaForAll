package com.iris.java8.defaultstatic.methods;

import java.util.Collections;
import java.util.List;

import com.iris.model.Student;

public interface MyInterface {
	
	default public List<Student> sortStudents(List<Student> stulist){
		Collections.sort(stulist);
		
		return stulist;
	}
	
	static public void greet(String name) {
		System.out.println("Welcome " + name);
	}
	
	public abstract Integer getMaxNum(List<Integer> intList);

}
