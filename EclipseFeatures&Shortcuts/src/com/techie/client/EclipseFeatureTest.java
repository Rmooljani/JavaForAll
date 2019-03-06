package com.techie.client;

import static com.techie.util.TechieUtil.COMPANY_NAME;
import static com.techie.util.TechieUtil.getLocation;

import com.techie.dummy.dao.EmployeeDao;

public class EclipseFeatureTest {
	
	public static void main(String[] args) {
		
		
	String location =
			getLocation();// 1. put cursor at the end of getLoaction() the press ctrl + ! + enter, to add local variable automatically
	
	String companyName = COMPANY_NAME;
	System.out.println(location + "  " + companyName);
	
	//================================================================================================================
	String SQL = //2. to format multiple lines together use ALT + Shift + A
            
			"CREATE TABLE `pets` (                        "+
			"		  `ID` int(11) NOT NULL,              "+
			"		  `Name` varchar(30) NOT NULL,        "+
			"		  `Breed` varchar(20) NOT NULL,       "+
			"		  `Age` int(11) DEFAULT NULL,         "+
			"		  `GENDER` varchar(9) DEFAULT NULL,   "+
			"		  PRIMARY KEY (`ID`)                  "+
			"		) a                                   " ;
	
	//================================================================================================================
	
	EmployeeDao dao = new EmployeeDao();
	//3. Type filters --> windows -> preferences -> java -> appearance -> Type Filters.
	dao.getEmployeesId();
	dao.getEmployeesname();
	System.out.println(dao);
	//================================================================================================================
	
	// 4. convert anonymous class to lambda expression -- > ctrl + 1 -> put cursor b/w anywhr in anonymous class
	
	Runnable  runnable = new Runnable() {
		@Override
		public void run() {
			System.out.println("inside anonymous class...");
		}
	};
	new Thread(runnable).start();
	
	//================================================================================================================
	
	// 5. convert lambda expression to anonymous class -- > ctrl + 1 -> put cursor b/w () & ->
	
		Runnable  runnable1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("inside anonymous class...");
			}
		};
		new Thread(runnable1).start();
		
		//================================================================================================================
		
		for(int i = 0;i<=20;i++) {
			findPower(2,i); // 6.ctrl + B -> conditional breakpoint by right click on toggle point 
		}
		//================================================================================================================
		
		//================================================================================================================

		
	}

	private static void findPower(double number, int i) {
		System.out.println("value of i = " + i);
		double pow = Math.pow(number, i);
		System.out.println("number " +number + " raised to power :" + i + " is= " + pow);
	}
	
	
}
