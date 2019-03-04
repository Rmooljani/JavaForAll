package com.techie.model;

public class Pancard {

	private String panHolderName;
	private String panNo;
	

	public Pancard(String panHolderName, String panNo) {
		super();
		this.panHolderName = panHolderName;
		this.panNo = panNo;
	}


	public String getPanHolderName() {
		return panHolderName;
	}


	public String getPanNo() {
		return panNo;
	}


	@Override
	public String toString() {
		return "Pancard [panHolderName=" + panHolderName + ", panNo=" + panNo + "]";
	}
	
	
}
