package com.general.interview.programs.level1;

public class FindDuplicatesFromArray {
	
	public static void main(String[] args) {
		
		 String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		  
	        for (int i = 0; i < strArray.length-1; i++)
	        {
	            for (int j = i+1; j < strArray.length; j++)
	            {
	                if( (strArray[i].equals(strArray[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate Element is : "+strArray[j]);
	                }
	            }
	        }
	        
	        Integer[] intArray = {345,764,343,678,764,345,888,99,00,99,66};
			  
	        for (Integer i = 0; i < intArray.length-1; i++)
	        {
	            for (Integer j = i+1; j < intArray.length; j++)
	            {
	            	 if( (intArray[i].equals(intArray[j])) && (i != j) )
	                		
	                {
	                    System.out.println("Duplicate Element is : "+intArray[j]);
	                }
	            }
	        }
	}

}
