package com.iris.impl;

import java.util.ArrayList;
import java.util.List;

import com.iris.java8.defaultstatic.methods.MyInterface;
import com.iris.model.Student;

public class ClientTest {
	
	public static void main(String[] args) {
		
		MyInterface myinterface = new MyClass();
		List<Integer> intlist = new ArrayList<>();
		intlist.add(125);
		intlist.add(67654);
		intlist.add(543);
		intlist.add(876);
		intlist.add(1234);
		intlist.add(76543);
		
		myinterface.getMaxNum(intlist);
		System.out.println("Max no is - " + myinterface.getMaxNum(intlist));
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("rashii", 22));
		stuList.add(new Student("tiyaaa", 43));
		stuList.add(new Student("xoxo", 33));
		stuList.add(new Student("maxx", 21));
		stuList.add(new Student("rohina", 62));
		stuList.add(new Student("dom", 42));
		stuList.add(new Student("francis", 12));
		
		List<Student> sortedStudents = myinterface.sortStudents(stuList);
		
		for(Student student : sortedStudents) {
			
		System.out.println("Sorted student list is here : " +student.getName() + " " + student.getAge());
		MyInterface.greet(student.getName());
		}
		
		
	}

}
