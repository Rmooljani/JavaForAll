package com.general.interview.programs.level2;

import java.io.IOException;

public class ExecuteCMDCommand {
	
	public static void main(String[] args) {
		
		try {
			Runtime.getRuntime().exec("cmd.exe /c D:\\myfile.txt");
			Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
