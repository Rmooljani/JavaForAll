package com.general.interview.programs.level2;

import java.io.File;
import java.io.IOException;

public class FileIOHandlingCreateFile {
	public static void main(String[] args) {
		
		String fileName = "D:\\myfile12.txt";
		File file = new File(fileName);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File has been created successfully.." +fileName);
			}else {
				System.out.println("File already exists in the specified directory.." +fileName);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
