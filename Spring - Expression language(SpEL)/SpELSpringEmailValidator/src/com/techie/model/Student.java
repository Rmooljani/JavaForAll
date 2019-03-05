package com.techie.model;

public class Student {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [email=" + email + "]";
	}
	
	
}
