package com.techie.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard {
	
	@Value("#{employee.empName}")
	private String panHolderName;
	@Value("DEYHL7658W")
	private String panNo;
	
	public String getPanHolderName() {
		return panHolderName;
	}
	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "Pancard [panHolderName=" + panHolderName + ", panNo=" + panNo + "]";
	}
	
	

}
