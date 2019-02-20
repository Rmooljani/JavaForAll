package com.general.interview.programs.level2;

import java.io.File;

public class FindParentDirectory {

	public static void main(String[] args) {
		
		String fileName = "D:\\abcd.txt";
		
		File file = new File(fileName);
		
		System.out.println("Parent Directory is :" + file.getParent());
		
		System.out.println("List of available filesystem roots::");
		
		for(File file1 : File.listRoots()) {
			System.out.println(file1);
		}
	}
}
