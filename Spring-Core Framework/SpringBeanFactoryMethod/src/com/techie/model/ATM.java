package com.techie.model;

public class ATM {
	
	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void printBalanceInfo(String accountNumber) {
		getPrinter().printBalanceInfo(accountNumber);
	}

}
