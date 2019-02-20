package com.general.interview.programs.level2;

import java.io.File;
import java.io.IOException;

public class CreateFileInCurrentPath {
	
	public static void main(String[] args) {
		
		try {	
		String fileName = "D:\\abcd.txt";
		
		String currentPath = System.getProperty("user.dir");
		System.out.println("current working directory : " +currentPath);
		String absolutePath = new String(currentPath + File.separator + fileName);
		System.out.println(absolutePath);
		File file = new File(fileName);
		System.out.println(file);
		
			/*if(file.createNewFile()) {
				System.out.println("File is created in specified path with specified name." + currentPath + File.separator + fileName);
			}else {
				System.out.println("file is already been created..." + currentPath + File.separator + fileName);
			}*/
	
			if(file.createNewFile()) {
				System.out.println("File has been created successfully.." +currentPath + File.separator + fileName);
			}else {
				System.out.println("File already exists in the specified directory.." +currentPath + File.separator + fileName);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
