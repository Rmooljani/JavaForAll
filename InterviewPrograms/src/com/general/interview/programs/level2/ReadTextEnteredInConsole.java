package com.general.interview.programs.level2;

import java.io.DataInputStream;
import java.io.IOException;

public class ReadTextEnteredInConsole {
	
	public static void main(String[] args) {
		DataInputStream dis = null;
		System.out.println("Type some text and press ");
		dis = new  DataInputStream(System.in);
		char ch;
		try {
			while((ch=(char)dis.read())!=0) {
				System.out.print(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(dis!=null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	

}
