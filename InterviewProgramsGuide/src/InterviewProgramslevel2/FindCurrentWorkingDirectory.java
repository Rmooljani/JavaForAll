package com.general.interview.programs.level2;

public class FindCurrentWorkingDirectory {
	
	public static void main(String[] args) {
		String currentPath = System.getProperty("user.dir");
		System.out.println("Current working directory ::" +currentPath);
	}

}
